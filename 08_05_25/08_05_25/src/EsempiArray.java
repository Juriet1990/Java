import java.util.Scanner;

public class EsempiArray {
    public static void main(String[] args) {
        int[] listaVoti = new int[6];
        Scanner inputTastiera = new Scanner(System.in);

        for (int i = 0; i < listaVoti.length; i++) {
            System.out.println("Inserisci il voto dello studente #:" + i);
            listaVoti[i] = inputTastiera.nextInt();
        }

        int somma = 0;
        for (int i = 0; i < listaVoti.length; i++) {
            somma = somma + listaVoti[i];
        }
        double mediaVoti = somma / listaVoti.length;
        System.out.println("La media è:" + mediaVoti);
    }
}