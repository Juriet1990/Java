// Scrivere un programma che stampi ‘’TEST OK’’ se un numero preso in input da un utente sia maggiore o uguale a 50, altrimenti stampi ‘’TEST NON PASSATO’’. Il programma deve infine stampare ‘’FINITO’’.

import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner inputTastiera = new Scanner(System.in);

        int numeroInput = inputTastiera.nextInt();
        inputTastiera.nextLine();

        if (numeroInput >= 50) {
            System.out.println("TEST OK");
        } else {
                System.out.println("TEST NON PASSATO");
            }
        } // end main
} // end class
