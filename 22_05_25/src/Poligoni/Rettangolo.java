package Poligoni;

public class Rettangolo extends Poligono{

    private double altezza;
    private double base;

    public Rettangolo(){
        super();
    }

    public Rettangolo(int numeroLati, double base, double altezza){
        super(numeroLati);
        this.altezza = altezza;
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcolaPerimetro() {
        return (this.altezza * 2) + (this.base * 2);
    }

    @Override
    public double calcolaArea() {
        return this.base * this.altezza;
    }
}
