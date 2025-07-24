package Esercizi;

public class PersonaMain {
    public static void main(String[] args) {
        Persona lukeSkywalker = new Persona("Luke", "Skywalker", "Jedi", 20); // metto i dati del costruttore
        Persona obiwanKenobi = new Persona();
        obiwanKenobi.setNome("Obi-Wan");
        obiwanKenobi.setCognome("Kenobi");
        obiwanKenobi.setOccupazione("Maestro Jedi");
        obiwanKenobi.setEta(40);

        System.out.println("Nome:" + lukeSkywalker.getNome());
        System.out.println("Cognome:" + lukeSkywalker.getCognome());
        System.out.println("Occupazione:" + lukeSkywalker.getOccupazione());
        System.out.println("Età:" + lukeSkywalker.getEta());

        System.out.println("Nome:" + obiwanKenobi.getNome());
        System.out.println("Cognome:" + obiwanKenobi.getCognome());
        System.out.println("Occupazione:" + obiwanKenobi.getOccupazione());
        System.out.println("Età:" + obiwanKenobi.getEta());
    }
}
