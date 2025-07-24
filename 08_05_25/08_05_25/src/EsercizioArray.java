// Trovare quanti numeri pari ci sono all'interno di un array

import java.util.Scanner;

public class EsercizioArray {
    public static void main(String[] args) {
        int[] arrNumPari = new int[5];

        Scanner inputTastiera = new Scanner(System.in);

        for(int i = 0; i < arrNumPari.length; i++) {
            System.out.println("Inserisci elemento: ");
            arrNumPari[i] = inputTastiera.nextInt();
        }

    }
}
