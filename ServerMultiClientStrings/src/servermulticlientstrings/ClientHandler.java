package servermulticlientstrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientHandler implements Runnable {
    //codici ansi per colorare il testo nella console
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED_BOLD = "\u001B[1;31m";
    private static final String ANSI_YELLOW_BOLD = "\u001B[1;33m";
    private static final String ANSI_BLUE_BOLD = "\u001B[1;34m";

    private Socket socket;
    private PrintWriter output;
    private String username;
    private boolean isAdmin = false;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
    public ClientHandler(Socket socket) {
        this.socket = socket;
        ServerMultiClientStrings.incrementaConnessioni();
    }

    public Socket getSocket() {
        return socket;
    }

    //metodo di invio messaggi verso il client
    public void sendMessage(String msg) {
        if (output != null) {
            output.println(msg);
        }
    }
    

    @Override
    public void run() {
        InputStream is = null;
        try {
            is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader input = new BufferedReader(isr);

            OutputStream os = socket.getOutputStream();
            output = new PrintWriter(os, true);

            Boolean check = false;
            String nome;
            while(check != true){
                output.println("[SERVER]: Inserire il nome utente");
                nome = input.readLine();
                if(ServerMultiClientStrings.checkNome(nome)){
                   output.println("[SERVER]: Nome vuoto o già in uso, riprova.");
                   continue;
                }

               //se il nome coincide con l’amministratore, chiedi la password
               if (nome.equalsIgnoreCase(ServerMultiClientStrings.nomeAmministratore)) {
                    output.println("[SERVER]: Inserisci la password amministratore:");
                    String pw = input.readLine();

                    if (pw != null && pw.equals(ServerMultiClientStrings.pwAmministratore)) {
                        output.println("[SERVER]: Accesso amministratore effettuato con successo!");
                        this.setAdmin(true);
                    } else {
                        output.println("[SERVER]: Password errata, accesso negato.");
                        continue; //torna a chiedere il nome
                    }
                }

               output.println("[SERVER]: Benvenuto " + nome);
               this.setUsername(nome);
               ServerMultiClientStrings.addClient(this, nome);
               check = true;
            }
            

            
            output.println("[SERVER]: Inserisci una stringa (digita 'fine' per terminare)");

            String stringaRicevuta;
            do {
                stringaRicevuta = input.readLine();

                if (stringaRicevuta == null) {
                    System.out.println("Il client " + socket.getInetAddress() + " ha chiuso la connessione");
                    break;
                }

                //comando per terminare la connessione
                if ("FINE".equalsIgnoreCase(stringaRicevuta.trim())) {
                    output.println("[SERVER]: Hai deciso di terminare, ciao!");
                    break;
                }
                //comando per mostrare tutti gli utenti connessi
                if("/lista".equalsIgnoreCase(stringaRicevuta.trim())){
                    output.println("[SERVER]: Utenti connessi: " + String.join(", ", ServerMultiClientStrings.lista));
                    continue;
                }
                
                if("/pwd".equalsIgnoreCase(stringaRicevuta.trim())){
                    if (!this.isAdmin()) {
                        output.println("[SERVER]: Solo l'amministratore può usare questo comando.");
                        continue;
                    }else{
                        output.println("[SERVER]: Immetti la nuova password per admin");
                        String nuovaPw = input.readLine();

                        if (nuovaPw != null && nuovaPw.isBlank() == false) {
                            ServerMultiClientStrings.setPwAmministratore(nuovaPw);
                        }else {
                            output.println("[SERVER]: La password è nulla o vuota!");
                        }
                    }
                }
                
                if (stringaRicevuta.trim().startsWith("/kick")) {
                    String resto = stringaRicevuta.substring(6).trim();
                    int firstSpace = resto.indexOf(' ');

                    if (!this.isAdmin()) {
                        output.println("[SERVER]: Solo l'amministratore può usare questo comando.");
                        continue;
                    }

                    if (resto.isEmpty()) {
                        output.println("[SERVER]: Devi specificare un utente da espellere. Usa: /kick <nome>");
                        continue;
                    }

                    String nomeKick;
                    if (firstSpace == -1) {
                        nomeKick = resto; //tutto resto è il nome
                    } else {
                        nomeKick = resto.substring(0, firstSpace).trim();
                    }

                    if (ServerMultiClientStrings.checkNome(nomeKick)) {
                        output.println(ServerMultiClientStrings.kickUser(nomeKick));
                    } else {
                        output.println("[SERVER]: Nessun utente trovato con nome '" + nomeKick + "'");
                    }
                }
                
                if((stringaRicevuta.trim()).startsWith("/private")){
                    String resto = stringaRicevuta.substring(9).trim();
                    int firstSpace = resto.indexOf(' ');

                    if (firstSpace == -1) {
                        output.println("[SERVER]: Formato non valido. Usa: /private <nome> <messaggio>");
                        continue;
                    }

                    String nomeReceiver = resto.substring(0, firstSpace).trim();
                    String messaggio = resto.substring(firstSpace + 1).trim();

                    if (nomeReceiver.isEmpty() || messaggio.isEmpty()) {
                        output.println("[SERVER]: Devi specificare sia il nome che il messaggio!");
                        continue;
                    }
                    
                    String displayName = this.getUsername();
                    //se è admin, evidenzia il nome
                    if (this.isAdmin()) {
                        displayName = ANSI_RED_BOLD + this.getUsername().toUpperCase() + ANSI_RESET;
                    }

                    output.println(ServerMultiClientStrings.privateMsg(nomeReceiver, messaggio, this, displayName));
                    continue;
                }

                if (stringaRicevuta.isBlank()) {
                    output.println("[SERVER] Hai inserito una stringa vuota, riprova!");
                    continue;
                }

                //broadcast a tutti tranne il mittente
                //String msg = "[" + socket.getInetAddress() +  " -> " + this.getUsername() + "]: " + stringaRicevuta;
                String displayName = this.getUsername();
                //se è admin, evidenzia il nome
                if (this.isAdmin()) {
                    displayName = ANSI_RED_BOLD + this.getUsername().toUpperCase() + ANSI_RESET;
                }
                String msg = "[" + socket.getInetAddress() + " -> " + displayName + "]: " + stringaRicevuta;
                ServerMultiClientStrings.broadcast(msg, this);

            } while (true);

            System.out.println("[SERVER]: Fine dialogo con " + socket.getInetAddress());
            output.println("[SERVER]: Fine dialogo con il server");

        } catch (IOException ex) {
            //Logger.getLogger(ClientHandler.class.getName())
             //       .log(Level.SEVERE, "[SERVER]: Errore durante la comunicazione", ex);
        } finally {
            try {
                if (is != null) is.close();
                if (socket != null) socket.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName())
                        .log(Level.SEVERE, "[SERVER]: Errore nella chiusura socket", ex);
            }

            ServerMultiClientStrings.decrementaConnessioni();
            ServerMultiClientStrings.removeClient(this, this.getUsername()); //rimuovo dall’insieme
        }
    }
}

