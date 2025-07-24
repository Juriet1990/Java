public class Insegnante extends Dipendente {
    public Insegnante(String nome) {
        super(nome);
    }

    @Override
    public String getMansione() {
        return "Insegnante";
    }
}