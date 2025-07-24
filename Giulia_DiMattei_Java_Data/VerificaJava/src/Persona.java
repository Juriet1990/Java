public class Persona {
    private String Nome;
    private String Cognome;
    private String CodiceFiscale;
    private String Indirizzo;

    public Persona() {
    } // costruttore vuoto

    public Persona(String Nome, String Cognome, String CodiceFiscale, String Indirizzo) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.CodiceFiscale = CodiceFiscale;
        this.Indirizzo = Indirizzo;
    }

        public String getNome(){
            return Nome;
        } // getNome

        public String setNome(){
            return Nome;
        } // setNome

        public String getCognome(){
            return Cognome;
        } // getCognome

        public String setCognome(){
            return Cognome;
        } // setCognome

        public String getCodiceFiscale(){
            return CodiceFiscale;
        } // getCodiceFiscale

        public String setCodiceFiscale(){
            return CodiceFiscale;
        } // setCodiceFiscale

        public String getIndirizzo(){
            return Indirizzo;
        } // getIndirizzo

        public String setIndirizzo(){
            return Indirizzo;
        } // setIndirizzo

} // end Persona
