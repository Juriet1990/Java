public class Persona {
    private String cf;
    private String nome;
    private String cognome;
    private String indirizzo;

    public Persona(){}

    public Persona(String cf, String nome, String cognome, String indirizzo) { // costruttore
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
    }

    // getter e setter

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
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

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override //
    public String toString() {
        return "Persona{" +
                "cf='" + cf + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}
