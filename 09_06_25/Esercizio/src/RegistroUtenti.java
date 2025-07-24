import java.util.ArrayList;
import java.util.List;

public class RegistroUtenti {
    private List<Utente>utenti = new ArrayList<>();

    public void aggiungiUtente(Utente u) {
        utenti.add(u);
    }

    public List<Utente> trovaUtente() throws UtenteNonTrovatoException {
        return utenti;
    }

    public Utente cercaPerCodiceFiscale(String codiceFiscaleRicerca) throws UtenteNonTrovatoException { // prende l'eccezione custom
        for (Utente u: utenti) { // ciclo forEach
            if (u.getCodiceFiscale().equalsIgnoreCase(codiceFiscaleRicerca)) { // metodo classe string, che ignora il case sensitive
                return u;
            }
        }

        throw new UtenteNonTrovatoException(codiceFiscaleRicerca);
    }

    public void eliminaUtente(String cf) throws UtenteNonTrovatoException {
        for (Utente u: utenti) {
            if (u.getCodiceFiscale().equalsIgnoreCase(eliminaUtente)) {
                return boolean;
            }
        }

        throw new UtenteNonTrovatoException(cf);
    }

    public void modificaUtente(String cf) throws UtenteNonTrovatoException {

    }
}
