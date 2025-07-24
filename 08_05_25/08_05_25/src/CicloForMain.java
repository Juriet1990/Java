import java.util.Scanner;

/** Cicli in Java
 * FOR
 **/
public class CicloForMain {
    public static void main(String[] args) {
        int numeroCicli;
        int numeroDaSommare;
        Scanner inputTastiera = new Scanner(System.in);
        int somma = 0;

        System.out.println("Quante volte vuoi iterare?");
        numeroCicli = inputTastiera.nextInt();

        for(int i = 0; 1 < numeroCicli; i++){
            System.out.println("Inserisci il numero che vuoi sommare");
            numeroDaSommare = inputTastiera.nextInt();
            somma = somma + numeroDaSommare;
            i++;
        }
    }
}
