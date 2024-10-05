package esercizio.pkg2;

public class Student {
    private String nome;
    private String cognome;
    private int annoDiNascita;
    private String classe;
    private String specializzazione;

    public Student(String nome, String cognome, int annoDiNascita, String classe, String specializzazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoDiNascita = annoDiNascita;
        this.classe = classe;
        this.specializzazione = specializzazione;
        
        checkDati(nome, cognome, annoDiNascita, classe, specializzazione);
    }
    
    public void checkDati(String nome, String cognome, int annoDiNascita, String classe, String specializzazione) {
        if(nome == null | cognome == null | "".equals(nome) | "".equals(cognome)){
            System.out.println("Il nome o cognome inseriti non sono validi");
        } else if(annoDiNascita < 1970 | annoDiNascita > 2009){
            System.out.println("L'anno di nascita inserito non e' valido");
        }
    }

    @Override
    public String toString() {
        return "nome: " + nome + ", cognome: " + cognome + ", anno di nascita: " + annoDiNascita + ", classe: " + classe + ", specializzazione: " + specializzazione;
    }
}
