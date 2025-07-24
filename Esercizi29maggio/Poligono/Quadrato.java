public class Quadrato extends Poligono {
    private double lato;

    public Quadrato(double lato) {
        super(4); // o: lato
        this.lato = lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato * 4;
    }

    @Override
    public double calcolaArea() {
        return lato * lato;
    }
}