import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Student {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private String classe;
    private String specializzazione;

    private static final int ANNO_MINIMO = 1970;
    private static final int ANNO_MASSIMO = 2009;

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Student(String nome, String cognome, LocalDate dataDiNascita, String classe, String specializzazione) throws IllegalArgumentException {
        setNome(nome);
        setCognome(cognome);
        setDataDiNascita(dataDiNascita);
        setClasse(classe);
        setSpecializzazione(specializzazione);
    }

    //nome
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il nome non può essere nullo o vuoto.");
        }
        this.nome = nome;
    }

    //cognome
    public void setCognome(String cognome) throws IllegalArgumentException {
        if (cognome == null || cognome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il cognome non può essere nullo o vuoto.");
        }
        this.cognome = cognome;
    }

    //data di nascita
    public void setDataDiNascita(LocalDate dataDiNascita) throws IllegalArgumentException {
        int annoDiNascita = dataDiNascita.getYear();
        if (annoDiNascita < ANNO_MINIMO || annoDiNascita > ANNO_MASSIMO) {
            throw new IllegalArgumentException("L'anno di nascita deve essere compreso tra " + ANNO_MINIMO + " e " + ANNO_MASSIMO + ".");
        }
        this.dataDiNascita = dataDiNascita;
    }

    //classe
    public void setClasse(String classe) throws IllegalArgumentException {
        if (classe == null || !classe.matches("[1-5][A-Z]")) {
            throw new IllegalArgumentException("La classe deve essere in formato valido (es. 4C, 3B, 5A).");
        }
        this.classe = classe;
    }

    //specializzazione
    public void setSpecializzazione(String specializzazione) throws IllegalArgumentException {
        if (specializzazione == null || !specializzazione.matches("IA|MM|MP|CM|ET|BI")) {
            throw new IllegalArgumentException("Specializzazione non valida. Deve essere una tra: IA, MM, MP, CM, ET, BI.");
        }
        this.specializzazione = specializzazione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public String getClasse() {
        return classe;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    //calcolo età basata sulla data di nascita
    public int getEta() {
        LocalDate today = LocalDate.now();
        return Period.between(dataDiNascita, today).getYears();
    }

    @Override
    public String toString() {
        return "Studente: " + nome + " " + cognome +
               "\nData di nascita: " + dataDiNascita.format(DATE_FORMATTER) + " (Età: " + getEta() + " anni)" +
               "\nClasse: " + classe +
               "\nSpecializzazione: " + specializzazione;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner per ricevere input da tastiera

        Student[] studenti = new Student[5]; //dichiarazione array per memorizzare 5 studenti

        //ciclo per raccogliere i dati degli studenti
        for (int i = 0; i < studenti.length; i++) {
            try {
                //chiede all'utente di inserire i dati dello studente
                System.out.println("Inserisci i dati dello studente " + (i + 1) + " (nome, cognome, data di nascita [GG-MM-YYYY], classe, specializzazione): ");
                String input = scanner.nextLine();

                //divide i dati inseriti usando la virgola come separatore
                String[] dati = input.split(",");

                //controlla che l'utente abbia inserito esattamente 5 campi
                if (dati.length != 5) {
                    throw new IllegalArgumentException("Errore: Inserisci esattamente 5 dati separati da virgole.");
                }

                //assegna i valori ottenuti alle variabili corrispondenti
                String nome = dati[0].trim();
                String cognome = dati[1].trim();

                //converte la data di nascita dal formato stringa "gg-MM-aaaa" a LocalDate
                LocalDate dataDiNascita = LocalDate.parse(dati[2].trim(), DATE_FORMATTER);
                
                String classe = dati[3].trim();
                String specializzazione = dati[4].trim();

                //crea un nuovo oggetto Student e lo aggiunge all'array
                studenti[i] = new Student(nome, cognome, dataDiNascita, classe, specializzazione);
                System.out.println("Studente " + (i + 1) + " creato con successo!\n");

            } catch (IllegalArgumentException | DateTimeParseException e) {
                //gestisce eventuali errori di inserimento dei dati
                System.out.println("Errore durante l'inserimento dei dati: " + e.getMessage());
                i--;
            }
        }

        //print delle informazioni di tutti gli studenti inseriti
        System.out.println("\nInformazioni sugli studenti:");
        for (Student studente : studenti) {
            System.out.println(studente);
        }

        scanner.close();
    }
}
