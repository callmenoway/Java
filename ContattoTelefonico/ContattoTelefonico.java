package contattotelefonico;

public class ContattoTelefonico {

    public static void main(String[] args) {
        Contatto contatto = new Contatto();
        contatto.inserisciContatto("Mario", "Rossi", "123456789", "mario.rossigmail.com", "Via Fuoco 12", "12 gennaio 2000", "Non chiamare la domenica");
        contatto.CheckEmail();
        contatto.visualizzaContatto();
    }
    
}
