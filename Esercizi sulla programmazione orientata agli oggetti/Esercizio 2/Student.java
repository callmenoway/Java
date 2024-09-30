public class Student {

    //dichiarazione delle variabili per i dati dello studente
    private String nome;
    private String cognome;
    private int anno_di_nascita;
    private String classe;
    private String specializzazione;

    //costanti per limitare l'anno di nascita tra 1970 e 2009
    private static final int ANNO_MINIMO = 1970;
    private static final int ANNO_MASSIMO = 2009;

    public Student(String nome, String cognome, int anno_di_nascita, String classe, String specializzazione) throws IllegalArgumentException {
        setNome(nome);
        setCognome(cognome);
        setAnnoNascita(anno_di_nascita);
        setClasse(classe);
        setSpecializzazione(specializzazione);
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il nome non può essere nullo o vuoto.");
        }
        this.nome = nome;
    }

    public void setCognome(String cognome) throws IllegalArgumentException {
        if (cognome == null || cognome.trim().isEmpty()) {
            throw new IllegalArgumentException("Il cognome non può essere nullo o vuoto.");
        }
        this.cognome = cognome;
    }

    public void setAnnoNascita(int anno_di_nascita) throws IllegalArgumentException {
        if (anno_di_nascita < ANNO_MINIMO || anno_di_nascita > ANNO_MASSIMO) {
            throw new IllegalArgumentException("L'anno di nascita deve essere compreso tra " + ANNO_MINIMO + " e " + ANNO_MASSIMO + ".");
        }
        this.anno_di_nascita = anno_di_nascita;
    }

    public void setClasse(String classe) throws IllegalArgumentException {
        if (classe == null || !classe.matches("[1-5][A-Z]")) {
            throw new IllegalArgumentException("La classe deve essere in formato valido (es. 4C, 3B, 5A).");
        }
        this.classe = classe;
    }

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

    public int getAnno_di_nascita() {
        return anno_di_nascita;
    }

    public String getClasse() {
        return classe;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    @Override
    public String toString() {
        return "Studente: " + nome + " " + cognome +
               "\nAnno di nascita: " + anno_di_nascita +
               "\nClasse: " + classe +
               "\nSpecializzazione: " + specializzazione;
    }

    public static void main(String[] args) {
        try {
            Student studente1 = new Student("Mario", "Rossi", 2005, "5A", "IA");
            System.out.println(studente1);

            // CASI IN CUI IL PROGRAMMA FORNISCE ERRORE:

            // 1. Nome vuoto
            Student studente2 = new Student("", "Bianchi", 2010, "2A", "IA");
            System.out.println(studente2);

            // 2. Anno di nascita fuori dal range accettabile
            Student studente3 = new Student("Mario", "Bianchi", 2027, "2A", "IA");
            System.out.println(studente3);

            // 3. Classe con formato non valido (es. "7A", che non esiste)
            Student studente4 = new Student("Mario", "Bianchi", 2010, "7A", "IA");
            System.out.println(studente4);

            // 4. Specializzazione non valida (es. "ZZ" che non è una delle sigle accettate)
            Student studente5 = new Student("Mario", "Bianchi", 2010, "2A", "ZZ");
            System.out.println(studente5);

        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
