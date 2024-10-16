
package segnozodiacale;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SegnoZodiacale {
    
    public static int oroscopo = 0;
    
    public static String calcolaSegnoZodiacale(int giorno, int mese) {
        String segno = ""; //dichiarazione stringa globale per il segno
        
        //dichiarazione di tutti i segni zodiacali esistenti
        switch (mese) {
            case 1:
                if (giorno <= 19) {
                    segno = "Capricorno";
                    oroscopo = 0;
                } else {
                    segno = "Acquario";
                    oroscopo = 1;
                }
                break;
            case 2:
                if (giorno <= 18) {
                    segno = "Acquario";
                    oroscopo = 1;
                } else {
                    segno = "Pesci";
                    oroscopo = 2;
                }
                break;
            case 3:
                if (giorno <= 20) {
                    segno = "Pesci";
                    oroscopo = 2;
                } else {
                    segno = "Ariete";
                    oroscopo = 3;
                }
                break;
            case 4:
                if (giorno <= 19) {
                    segno = "Ariete";
                    oroscopo = 3;
                } else {
                    segno = "Toro";
                    oroscopo = 4;
                }
                break;
            case 5:
                if (giorno <= 20) {
                    segno = "Toro";
                    oroscopo = 4;
                } else {
                    segno = "Gemelli";
                    oroscopo = 5;
                }
                break;
            case 6:
                if (giorno <= 20) {
                    segno = "Gemelli";
                    oroscopo = 5;
                } else {
                    segno = "Cancro";
                    oroscopo = 6;
                }
                break;
            case 7:
                if (giorno <= 22) {
                    segno = "Cancro";
                    oroscopo = 6;
                } else {
                    segno = "Leone";
                    oroscopo = 7;
                }
                break;
            case 8:
                if (giorno <= 22) {
                    segno = "Leone";
                    oroscopo = 7;
                } else {
                    segno = "Vergine";
                    oroscopo = 8;
                }
                break;
            case 9:
                if (giorno <= 22) {
                    segno = "Vergine";
                    oroscopo = 8;
                } else {
                    segno = "Bilancia";
                    oroscopo = 9;
                }
                break;
            case 10:
                if (giorno <= 22) {
                    segno = "Bilancia";
                    oroscopo = 9;
                } else {
                    segno = "Scorpione";
                    oroscopo = 10;
                }
                break;
            case 11:
                if (giorno <= 21) {
                    segno = "Scorpione";
                    oroscopo = 10;
                } else {
                    segno = "Sagittario";
                    oroscopo = 11;
                }
                break;
            case 12:
                if (giorno <= 21) {
                    segno = "Sagittario";
                    oroscopo = 11;
                } else {
                    segno = "Capricorno";
                    oroscopo = 0;
                }
                break;
            default:
                throw new IllegalArgumentException("Mese non valido.");
        }
        return segno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //dichiarazione scanner per l'input da tastiera
        
        String[] array={"La perseveranza ti portera' riconoscimenti nel lavoro","Le nuove tecnologie potrebbero semplificare la tua routine","Segui le tue emozioni; un'intuizione potrebbe rivelarsi preziosa","Un'opportunità inaspettata ti portera' nuova energia","La stabilita' finanziaria potrebbe migliorare nei prossimi giorni","E' il momento ideale per comunicare i tuoi desideri","Abbraccia il cambiamento e segui il tuo istinto","La tua creatività brillera'; condividi le tue idee","Un progetto a lungo termine sta per dare i suoi frutti","Relazioni armoniose porteranno serenita' nella tua vita","Una rivelazione sorprendera' e arricchira' la tua giornata","Viaggi imminenti o nuove avventure ti chiamano"};

        try {
            System.out.println("Inserisci il giorno di nascita: ");
            int giorno = scanner.nextInt();

            System.out.println("Inserisci il mese di nascita (numero): ");
            int mese = scanner.nextInt();

            System.out.println("Inserisci l'anno di nascita: ");
            int anno = scanner.nextInt();

            //validazione dei valori
            if (giorno < 1 || giorno > 31 || mese < 1 || mese > 12) {
                throw new IllegalArgumentException("Data non valida. Inserisci valori corretti.");
            }

            //calcolo del segno zodiacale
            if ((mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno > 30) {
                throw new IllegalArgumentException("Il mese " + mese + " ha solo 30 giorni.");
            } else if (mese == 2 && (giorno > 29 || (giorno == 29 && !(anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0))))) {
                throw new IllegalArgumentException("Febbraio ha solo 28 giorni, o 29 in anni bisestili.");
            }

            String segnoZodiacale = calcolaSegnoZodiacale(giorno, mese);
            System.out.println("Il tuo segno zodiacale e': " + segnoZodiacale); //print del risultato
            
            System.out.println("La frase di oggi e': " + array[oroscopo]);
            
            
        } catch (InputMismatchException e) {
            System.out.println("Errore: Inserisci solo numeri validi." + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
