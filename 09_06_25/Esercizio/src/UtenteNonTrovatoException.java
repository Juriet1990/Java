public class UtenteNonTrovatoException extends Exception {
    public UtenteNonTrovatoException(String cf) {
      super("Non so chi sia questa bellissima persona, con CF: " + cf);
    }
}
