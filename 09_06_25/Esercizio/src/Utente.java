public class Utente {
    private String nome;
    private String cognome;
    private String genere;
    private int eta;
    private String codiceFiscale;

    public Utente() {
    }

    public Utente(String nome, String cognome, String genere, int eta, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.eta = eta;
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", genere='" + genere + '\'' +
                ", eta=" + eta +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                '}';
    }
}
