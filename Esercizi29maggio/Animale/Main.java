public class Main {
    public static void main(String[] args) {
        Animale leone = new Leone();
        Animale tigre = new Tigre();

        System.out.println(leone.sound()); // oppure: leone.sound();
        System.out.println(tigre.sound()); // oppure: tigre.sound();
    }
}