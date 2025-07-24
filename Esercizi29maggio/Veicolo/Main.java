public class Main {
    public static void main(String[] args) {
        Veicolo auto = new Auto();
        Veicolo moto = new Moto();

        System.out.println(auto.startEngine());
        System.out.println(auto.stopEngine());

        System.out.println(moto.startEngine());
        System.out.println(moto.stopEngine());
    }
}