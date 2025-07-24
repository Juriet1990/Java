package Poligoni;

public abstract class Poligono {
    private int numeroLati;

    public Poligono(){}

    public Poligono(int numeroLati){
        this.numeroLati = numeroLati;
    }

    public int getNumeroLati() {
        return numeroLati;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    /* Funzione che calcola */
    public abstract double calcolaPerimetro();
    public abstract double calcolaArea();
}