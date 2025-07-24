import java.util.*; // * = aggiunge tutte le librerie con un simbolo

public class Colore {
    public static void main(String[] args) { // il must di ogni file java
        Scanner inputTastiera = new Scanner(System.in); // scanner server per far inserire l'input all'utente

        ArrayList<String> colori = new ArrayList<>(); // creo un array vuoto
        System.out.println("Quanti sono i tuoi colori preferiti?");

        int numeroColori = inputTastiera.nextInt(); // l'utente inserisce il numero di colori (che è un intero)
        inputTastiera.nextLine(); // serve per refreshare la linea precedente, altrimenti il 1° e il 2° sarebbero tutti sulla stessa linea di codice

        for (int i = 0; i < numeroColori; i++) { // ciclo for per stampare
            System.out.println("Inserisci il " + (i+1) + "°:");
            String colore = inputTastiera.nextLine();
            colori.add(colore);
        }

        System.out.println("/nColori:"); // stampa nell'ordine in cui li scrivi
        for (String colore : colori) {
            System.out.println(colore);
        }

        Collections.sort(colori);

        System.out.println("\nColori ordinati alfabeticamente:"); // stampa in ordine alfabetico
        for (String colore : colori) {
            System.out.println(colore);
        }

        inputTastiera.close();
    }
}


// public class Colore {
// public static void main(String[] args) {
// Colore c1 = new Red("Rosso"); ... ecc.
// No, perchè così non puoi scrivere i colori!