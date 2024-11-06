package contattotelefonico;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contatto {
    private String nome;
    private String cognome;
    private String numeroTelefono;
    private String email;
    private String indirizzo;
    private String dataDiNascita;
    private String note;
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public String getNote() {
        return note;
    }

    public String getEmail() {
        return email;
    }
    
    public void inserisciContatto(String nome, String cognome, String numeroTelefono, String email, String indirizzo, String dataDiNascita, String note){
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.indirizzo = indirizzo;
        this.dataDiNascita = dataDiNascita;
        this.note = note;
    }
    
    private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean emailValidator(String email)
    {
        if (email == null) {
            return false;
        }

        Matcher matcher = EMAIL_PATTERN.matcher(email);

        return matcher.matches();
    }
    
    public void CheckEmail(){
        if (emailValidator(email)) {

        }
        else {
            System.out.println("L'email inserita non e' valida");
            System.exit(0);
        }
    }
    
    public void visualizzaContatto(){
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Email: " + email);
        System.out.println("Indirizzo: " + indirizzo);
        System.out.println("Data di nascita: " + dataDiNascita);
        System.out.println("Note: " + note);
    }
    
}
