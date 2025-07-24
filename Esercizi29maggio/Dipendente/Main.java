public class Main {
    public static void main(String[] args) {
        Dipendente d1 = new Insegnante("Luna");
        Dipendente d2 = new Bidello("Sole");
    }

    System.out.println(d1.getNome() + "è un" + d1.getMansione());
    System.out.println(d2.getNome() + "è un" + d1.getMansione());
}