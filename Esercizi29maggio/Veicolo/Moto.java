public class Moto extends Veicolo {
    public void startEngine() {
        System.out.println("Il motore fa vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Il motore va a dormire...");
    }
}