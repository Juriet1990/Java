public class Auto extends Veicolo {
    public void startEngine() {
        System.out.println("Il motore si accende!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Il motore si spegne...");
    }
}