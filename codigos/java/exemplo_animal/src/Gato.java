// Subclasse Gato que implementa a interface AnimalDomestico
public class Gato extends Animal implements AnimalDomestico {
    public Gato(String nome, Dono dono) {
        super(nome, dono);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }

    @Override
    public void brincar() {
        System.out.println(getNome() + " está brincando com um novelo de lã.");
    }

    @Override
    public void levarAoVeterinario() {
        System.out.println(getDono().getNome() + " levou " + getNome() + " ao veterinário.");
    }
}