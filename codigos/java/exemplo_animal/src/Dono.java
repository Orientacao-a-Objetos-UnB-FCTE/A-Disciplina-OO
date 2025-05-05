import java.util.ArrayList;
import java.util.List;

// Classe para representar o dono do animal (composição)
public class Dono {
    private String nome;
    private List<AnimalDomestico> animais;  // Lista de animais domésticos

    public Dono(String nome) {
        this.nome = nome;
        this.animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAnimal(AnimalDomestico animal) {
        animais.add(animal);
    }

    public List<AnimalDomestico> getAnimais() {
        return animais;
    }
}