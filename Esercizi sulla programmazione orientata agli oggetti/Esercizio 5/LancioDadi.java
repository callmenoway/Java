import java.util.Random;
import java.util.Scanner;

public class LancioDadi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //oggetto per generare numeri casuali
        int punteggioTotale = 0; //punteggio totale del giocatore
        boolean continuaGioco = true; //variabile che determina se il gioco continua

        System.out.println("Benvenuto! Lancia i dadi e cerca di raggiungere 100 punti.");

        //ciclo che continua finché l'utente non decide di fermarsi o il punteggio raggiunge 100
        while (continuaGioco && punteggioTotale < 100) {
            //genera i numeri casuali per due dadi
            int dado1 = random.nextInt(6) + 1; //numero casuale tra 1 e 6
            int dado2 = random.nextInt(6) + 1; //numero casuale tra 1 e 6

            //somma dei due dadi
            int punteggioLancio = dado1 + dado2;

            //aggiunge la somma al punteggio totale
            punteggioTotale += punteggioLancio;

            //print risultati del lancio e il punteggio accumulato
            System.out.println("Hai lanciato " + dado1 + " e " + dado2 + ". Somma: " + punteggioLancio);
            System.out.println("Punteggio totale: " + punteggioTotale);

            //controlla se il punteggio totale ha raggiunto 100
            if (punteggioTotale >= 100) {
                System.out.println("Complimenti! Hai raggiunto o superato 100 punti.");
                break;
            }

            //chiede all'utente se vuole continuare a lanciare i dadi
            System.out.println("Vuoi continuare a lanciare? (s/n): ");
            String risposta = scanner.nextLine().toLowerCase();

            //se l'utente risponde 'n', il gioco termina
            if (risposta.equals("n")) {
                continuaGioco = false;
            }
        }

        //se il ciclo si è concluso, mostra il punteggio finale
        System.out.println("Gioco terminato. Punteggio finale: " + punteggioTotale);
        scanner.close();
    }
}
