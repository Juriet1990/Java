package Esercizi;

/**
 * 1: Data una Persona, creare delle specializzazioni di essa che rappresentino le varie specializzazioni
 * all’interno di un contesto scolastico.
 */

public class Persona { // proprietà della persona
    private String nome;
    private String cognome;
    private String occupazione;
    private int eta;

    public Persona() { // costruttore vuoto
    }

    public Persona(String nome, String cognome, String occupazione, int eta) { // costruttore pieno
        this.nome = nome;
        this.cognome = cognome;
        this.occupazione = occupazione;
        this.eta = eta;
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

    public String getOccupazione() {
        return occupazione;
    }

    public void setOccupazione(String occupazione) {
        this.occupazione = occupazione;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}


