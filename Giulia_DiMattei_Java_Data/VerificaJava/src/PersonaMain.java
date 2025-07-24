import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class PersonaMain {
    public static void main(String[] args) {
        // Nome
        Scanner name = new Scanner(System.in);
        System.out.println("Inserisci il nome");

        String Nome = name.nextLine();
        System.out.println("Mi chiamo " + Nome + ", piacere di conoscerti!");

        // Cognome
        Scanner surname = new Scanner(System.in);
        System.out.println("Inserisci il cognome");

        String Cognome = surname.nextLine();
        System.out.println("Il mio cognome è " + Cognome);

        // CodiceFiscale
        Scanner CF = new Scanner(System.in);
        System.out.println("Inserisci il codice fiscale");

        String CodiceFiscale = CF.nextLine();
        System.out.println("Il mio codice fiscale è: " + CodiceFiscale);

        // Indirizzo
        Scanner address = new Scanner(System.in);
        System.out.println("Inserisci indirizzo");

        String Indirizzo = address.nextLine();
        System.out.println("Abito in... " + Indirizzo);

    } // end main PersonaMain

public class CicloFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++);
        System.out.println("Nome" + "Cognome" + "CodiceFiscale" + "Indirizzo");
        } // end main CicloFor
    } // end class CicloFor

    public class cercaPerCodiceFiscale {
        public static void main(String[] args) throws IOException{
            List<PersonaMain> CF = new ArrayList<>();

            if (CF.contains(CF)) {
                System.out.println("Codice fiscale già inserito.");
            }
            else {
                System.out.println("Codice fiscale inserito.");
            }
        } // end main CheckList
    } // end class CheckList

} // end class PersonaMain
