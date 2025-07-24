import exceptions.UserAlreadyExistsException;
import exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner è il tipo. sc è il nome della variabile. = è l'assegnazione. new Scanner è un'istanza
        ArrayList<Persona> personaList = new ArrayList<>(); // questa è l'istanza di ArrayList per Persona

        for (int i = 0; i < 5; i++) { // ciclo for per definire che sono 5 utenti
            System.out.println("Inserisci il CF della persona " + (i + 1)); // print
            String cf = sc.nextLine(); // inserimento della stringa

            try{
                if(!personaList.isEmpty()){ // se la lista persona non è vuota
                    for(Persona p : personaList) { // crea una variabile p per una sola persona, che rivalorizzi una persona
                        if(p.getCf().equalsIgnoreCase(cf)) // prende il cf e ignora il camel case
                            throw new UserAlreadyExistsException("Utente con questo CF esiste"); // se la condizione precedente è vera, prende questo messaggio
                    }
                }//end if
            }//end try
            catch (UserAlreadyExistsException ex){ // se l'if è vero (riga 21)
                System.out.println("Eccezione: " + ex.getMessage()); // prende il messaggio con eccezione personalizzata UserAlreadyExistsException
            }

            System.out.println("Inserisci il NOME della persona" + (i + 1));
            String nome = sc.nextLine();
            System.out.println("Inserisci il COGNOME della persona" + (i + 1));
            String cognome = sc.nextLine();
            System.out.println("Inserisci il INDIRIZZO della persona" + (i + 1));
            String indirizzo = sc.nextLine();

            personaList.add(new Persona(cf, nome, cognome, indirizzo)); // crea una nuova istanza persona all'interno dell'ArrayList
        }//end for

        System.out.println("Inserisci il CF della persona che vuoi cercare");
        String cfDaCercare = sc.nextLine();

        boolean found = false; // variabile booleana assegnata a false
        try {  // se la condizione è falsa, entra nel ciclo; la condizione dev'essere falsa per poter entrare
            for (Persona p : personaList) { // foreach, per ogni elemento di persona crea una variabile per ogni persona e assegni la p
                if (p.getCf().equalsIgnoreCase(cfDaCercare)) { // cerca il match da cf inserito dall'utente e quello nella lista
                    System.out.println("Trovato!"); // se è vera stampa questo messaggio
                    found = true;
                }
            }//end for
            if(!found) // se non trovato, condizione di uscita dal try (= è vero che found è false?)
                throw new UserNotFoundException("Utente non trovato"); // prendi l'eccezione UserNotFoundException
        }//end try
        catch (UserNotFoundException ex){ // stampa messaggio
            System.out.println("Eccezione: " + ex.getMessage());
        }

    }
}