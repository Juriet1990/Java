// 1: Implementare la classe Poligono in modo astratto e le sue specializzazioni


public abstract class Poligono {
    protected int numeroLati;

    public Poligono(int numeroLati){
        this.numeroLati = numeroLati;
    }

    public int getNumeroLati(){
        return numeroLati;
    }

    public abstract double calcolaPerimetro();
    public abstract double calcolaArea();
}