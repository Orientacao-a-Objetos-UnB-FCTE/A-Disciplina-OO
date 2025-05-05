// Classe base (superclasse)
public class Animal {
    private String nome;
    private Dono dono;  // Composição: Animal tem um Dono

    public Animal() {
        this.nome = "";
        this.dono = null;
    }

    public Animal(String nome, Dono dono) {
        this.nome = nome;
        this.dono = dono;
        dono.adicionarAnimal((AnimalDomestico) this);  // Associa automaticamente ao dono
    }

    public String getNome() {
        return nome;
    }

    public Dono getDono() {
        return dono;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}