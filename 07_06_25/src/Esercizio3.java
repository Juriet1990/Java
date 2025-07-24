// Scrivere un programma che stampi la somma dei numeri che vanno da 1 a 100.

public class Esercizio3 {
    public static void main(String[] args) {
        int somma = 0;

        for (int i = 1; i <= 100; i++) {
            somma = somma + i; // al valore somma aggiungi +
        }
        System.out.println(somma);
    } // end main
} // end class
