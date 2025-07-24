// Sulla base dell’esercizio precedente usare 1 e 100 con delle variabili ‘’limite inferiore’’ limite superiore’’, così da poter manipolare i limiti a piacimento.

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner inputTastiera = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        int limiteInferiore = inputTastiera.nextInt();

        System.out.println("Inserisci il secondo numero:");
        int limiteSuperiore = inputTastiera.nextInt();


        int somma = 0;

        for (int i = limiteInferiore; i <= limiteSuperiore; i++) {
            somma = somma + i;
        }
        System.out.println("Il risultato della somma è: " + somma);
    } // end main
} // end class
