import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MappaPaesi {
    public static void main(String[] args) {
        List<String> cittaList = new ArrayList<>();
        cittaList.add("Torino"); // add: aggiunge Torino alla fine
        cittaList.add("Novara"); // set: aggiunge in una posizione specifica. esempio: 0 = prima posizione (come gli array)
        cittaList.add("Asti");

        List<String> cittaListLombardia = new ArrayList<>();
        cittaListLombardia.add("Milano");
        cittaListLombardia.add("Bergamo");
        cittaListLombardia.add("Magenta");

        HashMap<String, List<String>> regioniCitta = new HashMap<String, List<String>>();
        regioniCitta.put("Piemonte", cittaList);
        regioniCitta.put("Lombardia", cittaListLombardia);
        stampaRegioni(regioniCitta);

        HashMap<String, HashMap <String, List <String>>> paesi = new HashMap<String, HashMap <String, List <String>>>();
        paesi.put("Italia", regioniCitta);
        stampaPaesi(paesi);

    }

    public static void stampaPaesi(HashMap<String, HashMap <String, List <String>>> paesi) {
        for (String paese : paesi.keySet()) {
            System.out.println("Paese: " + paese);
        }
    }

    public static void stampaRegioni(HashMap<String, List<String>> regioniCitta) {
        for (String regione : regioniCitta.keySet()) { // ketSet: insieme di chiavi. le chiavi nelle hashmap non hanno duplicati
            System.out.println("Chiave regione: " + regione); // regione si riferisce alle singole chiavi della mappa (es: Piemonte)
            stampaLista(regioniCitta.get(regione));
        }
    }

    public static void stampaLista(List<String> cittaList) {
        for (String citta : cittaList) {
            System.out.println("\tValore citta: " + citta); // \t = impaginazione di come verrà stampata la lista città
        }
    }
}
