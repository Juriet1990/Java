import exceptions.MediaInsufficienteException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { // inserisco dei voti
       List<Double> listaVoti = new ArrayList<>();
       listaVoti.add(8.0);
       listaVoti.add(7.0);
       listaVoti.add(6.0);
       listaVoti.add(9.0);
       listaVoti.add(10.0);

       double sommaVoti = 0.0;
       for(Double voto :listaVoti)
           sommaVoti = sommaVoti + voto;

       try {
           double mediaVoti = sommaVoti / (double)listaVoti.size(); // calcolo media

           if (mediaVoti < 6.0)
               throw new MediaInsufficienteException("Media Insufficiente."); // eccezione
           System.out.println("Media: " + mediaVoti);
       }
       catch (MediaInsufficienteException ex) {
           System.out.println(ex.getMessage());
       }
    }
}
