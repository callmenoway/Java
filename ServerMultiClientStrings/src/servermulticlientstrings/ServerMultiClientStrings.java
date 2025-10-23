package servermulticlientstrings;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerMultiClientStrings {
    // contatori globali 
    public static int totaleConnessioni = 0; 
    public static int connessioniAttive = 0;
    public static String nomeAmministratore = "admin";
    public static String pwAmministratore = "admin";
    
    static List<String> lista = new ArrayList<String>();

    public List<String> getLista() {
        return lista;
    }

    public static void setPwAmministratore(String pwAmministratore) {
        ServerMultiClientStrings.pwAmministratore = pwAmministratore;
    }
    
    
    
    //insieme sincronizzato dei client attivi
    private static Set<ClientHandler> clients = 
            Collections.synchronizedSet(new HashSet<>());

    public static synchronized void incrementaConnessioni(){ 
        totaleConnessioni++; 
        connessioniAttive++; 
        System.out.println("[SERVER]: Totale connessioni: " + 
                totaleConnessioni + " | Connessioni attive: " + 
                connessioniAttive); 
    } 

    public static synchronized void decrementaConnessioni(){ 
        connessioniAttive--; 
        System.out.println("[SERVER]: Totale connessioni: " + 
                totaleConnessioni + " | Connessioni attive: " + 
                connessioniAttive); 
    }

    //aggiunge un client all’insieme
    public static void addClient(ClientHandler ch, String nome) {
        clients.add(ch);
        lista.add(nome);
        System.out.println("[SERVER]: Aggiunto client da " + ch.getSocket().getInetAddress() + " con nome " + ch.getUsername());
    }

    //rimuove un client alla disconnessione
    public static void removeClient(ClientHandler ch, String nome) {
        clients.remove(ch);
        lista.remove(nome);
        System.out.println("[SERVER]: Rimosso client da " + ch.getSocket().getInetAddress() + " con nome " + ch.getUsername());
    }

    //metodo di broadcast (esclude il mittente)
    public static void broadcast(String msg, ClientHandler sender) {
        synchronized (clients) {
            for (ClientHandler ch : clients) {
                if (ch != sender) { //evita di rispedire al mittente
                    ch.sendMessage(msg);
                }
            }
        }
    }
    
    //verifica che il nome utente sia unico e non vuoto
    public static boolean checkNome(String nome){
        if(lista.contains(nome) || nome.isEmpty() || nome.isBlank()){
            return true;
        }
        return false;
    }
    
    //invia un messaggio privato ad un altro utente
    public static String privateMsg(String nomeDestinatario, String messaggio, ClientHandler sender, String displayName) {
        synchronized (clients) {
            for (ClientHandler ch : clients) {
                if (ch.getUsername().equalsIgnoreCase(nomeDestinatario)) {
                    //manda il messaggio al destinatario
                    ch.sendMessage("[Messaggio privato da " + displayName + "]: " + messaggio);
                    //conferma al mittente
                    sender.sendMessage("[Messaggio privato a " + nomeDestinatario + "]: " + messaggio);
                    return "Messaggio privato inviato correttamente a " + nomeDestinatario + "!";
                }
            }
        }
        return "Il nome inserito non esiste o l’utente non è connesso!";
    }
    
    public static String kickUser(String nome){
        synchronized (clients) {
            for (ClientHandler ch : clients) {
                if (ch.getUsername().equalsIgnoreCase(nome)) {
                    try {
                        ch.sendMessage("[SERVER]: Sei stato disconnesso dall’amministratore.");
                        ch.getSocket().close(); //forza la chiusura della connessione
                        removeClient(ch, nome); //rimuove dalla lista dei client
                        lista.remove(nome);
                        decrementaConnessioni();
                        return "[SERVER]: L'utente '" + nome + "' è stato disconnesso.";
                    } catch (IOException e) {
                        return "[SERVER]: Errore durante la disconnessione dell'utente " + nome;
                    }
                }
            }
        }
        return "[SERVER]: Nessun utente con il nome '" + nome + "' trovato.";
    }
    
    public static void main(String[] args) {
        try {
            ServerSocket listener = new ServerSocket(9090);
            System.out.println("[SERVER]: In ascolto sulla porta 9090...");

            while (true) { 
                System.out.println("In attesa di una nuova connessione...");
                Socket client = listener.accept();
                System.out.println("Connessione con il client: " + client.getInetAddress());
                
                ClientHandler task = new ClientHandler(client);
                //addClient(task); // aggiungo all’insieme condiviso
                
                System.out.println("Creato il task collegato all'IP: " + 
                        task.getSocket().getInetAddress());
                new Thread(task).start();
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerMultiClientStrings.class.getName())
                  .log(Level.SEVERE, "Errore, listener non attivato!", ex);
        }
    }
}
