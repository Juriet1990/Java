public class main {
    public static void main(String[] args) {
        Quadrato q = new Quadrato(5.0);

        System.out.println("Numero lati" + q.numeroLati());
        System.out.println("Perimetro" + q.calcolaPerimetro());
        System.out.println("Area" + q.calcolaArea());
    }
}