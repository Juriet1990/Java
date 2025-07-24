// 2: Implementare la classe astratta Dipendente con le sue specializzazioni all’interno di un ambito scolastico


public abstract class Dipendente {
    protected String nome;
    protected String mansione;
    
    public Dipendente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMansione();
}