import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Dono donoJoao = new Dono("João");
        Dono donoAna = new Dono("Ana");

        Animal cachorroRex = new Cachorro("Rex", donoJoao);
        Animal gatoMimi = new Gato("Mimi", donoAna);
        Animal cachorroMax = new Cachorro("Max", donoAna);  // Ana tem dois animais

        // Mostrar todos os animais de cada dono e fazer todos brincarem e irem ao veterinário
        ArrayList<Dono> donos = new ArrayList<>(Arrays.asList(donoJoao, donoAna));

        for (Dono dono : donos) {
            System.out.println("\n---------------\nAnimais de " + dono.getNome() + ":");
            for (AnimalDomestico animal : dono.getAnimais()) {
                animal.brincar();
                animal.levarAoVeterinario();
            }
        }

        Dono donoCarlos = new Dono("Carlos");
        donos.add(donoCarlos);
        donos.remove(donoJoao);
        Animal cachorroRexAdotado = new Cachorro("Rex", donoCarlos);


        System.out.println("\n---------------");

        for (Dono dono : donos) {
            System.out.println("\n---------------\nAnimais de " + dono.getNome() + ":");
            for (AnimalDomestico animal : dono.getAnimais()) {
                animal.brincar();
                animal.levarAoVeterinario();
            }
        }
    }
}
