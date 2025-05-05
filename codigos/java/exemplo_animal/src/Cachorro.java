// Subclasse Cachorro que implementa a interface AnimalDomestico
public class Cachorro extends Animal implements AnimalDomestico {
    public Cachorro(String nome, Dono dono) {
        super(nome, dono);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }

    @Override
    public void brincar() {
        System.out.println(getNome() + " está brincando de buscar a bolinha.");
    }

    @Override
    public void levarAoVeterinario() {
        System.out.println(getDono().getNome() + " levou " + getNome() + " ao veterinário.");
    }
}