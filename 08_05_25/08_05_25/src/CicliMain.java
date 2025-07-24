import java.util.Scanner;

/** Cicli in Java
 * WHILE
**/
public class CicliMain {
    public static void main(String[] args) {
      int numeroCicli;
      int numeroDaSommare;

      Scanner inputTastiera = new Scanner(System.in);

      System.out.println("Quante volte vuoi iterare?");
      numeroCicli = inputTastiera.nextInt();

      int i = 0;
      int somma = 0;
      while(i < numeroCicli){
          System.out.println("Inserisci il numero che vuoi sommare");
          numeroDaSommare = inputTastiera.nextInt();
          somma = somma + numeroDaSommare;
          i++;
      }
    }
}