// Scrivere un programma che dati due numeri, scambi il valore di questi due.

public class Esercizio2 {
    public static void main(String[] args) {
        int A = 3;
        int B = 7;

        int C = A;// C è = a 3
        A = B; // A è = a 7 adesso!
        B = C;

        System.out.println(A + " " + B);
    } // end main
} // end class