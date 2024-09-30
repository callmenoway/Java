import java.util.InputMismatchException;
import java.util.Scanner;

public class SegnoZodiacale {

    public static String calcolaSegnoZodiacale(int giorno, int mese) {
        String segno = ""; //dichiarazione stringa globale per il segno
        
        //dichiarazione di tutti i segni zodiacali esistenti
        switch (mese) {
            case 1:
                if (giorno <= 19) {
                    segno = "Capricorno";
                } else {
                    segno = "Acquario";
                }
                break;
            case 2:
                if (giorno <= 18) {
                    segno = "Acquario";
                } else {
                    segno = "Pesci";
                }
                break;
            case 3:
                if (giorno <= 20) {
                    segno = "Pesci";
                } else {
                    segno = "Ariete";
                }
                break;
            case 4:
                if (giorno <= 19) {
                    segno = "Ariete";
                } else {
                    segno = "Toro";
                }
                break;
            case 5:
                if (giorno <= 20) {
                    segno = "Toro";
                } else {
                    segno = "Gemelli";
                }
                break;
            case 6:
                if (giorno <= 20) {
                    segno = "Gemelli";
                } else {
                    segno = "Cancro";
                }
                break;
            case 7:
                if (giorno <= 22) {
                    segno = "Cancro";
                } else {
                    segno = "Leone";
                }
                break;
            case 8:
                if (giorno <= 22) {
                    segno = "Leone";
                } else {
                    segno = "Vergine";
                }
                break;
            case 9:
                if (giorno <= 22) {
                    segno = "Vergine";
                } else {
                    segno = "Bilancia";
                }
                break;
            case 10:
                if (giorno <= 22) {
                    segno = "Bilancia";
                } else {
                    segno = "Scorpione";
                }
                break;
            case 11:
                if (giorno <= 21) {
                    segno = "Scorpione";
                } else {
                    segno = "Sagittario";
                }
                break;
            case 12:
                if (giorno <= 21) {
                    segno = "Sagittario";
                } else {
                    segno = "Capricorno";
                }
                break;
            default:
                throw new IllegalArgumentException("Mese non valido.");
        }
        return segno;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //dichiarazione scanner per l'input da tastiera

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
            System.out.println("Il tuo segno zodiacale è: " + segnoZodiacale); //print del risultato
            
        } catch (InputMismatchException e) {
            System.out.println("Errore: Inserisci solo numeri validi.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
