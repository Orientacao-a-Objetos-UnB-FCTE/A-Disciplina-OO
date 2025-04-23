public class CarroCombustao {
	private int capacidadeTanque;
	private String fabricante;
	private String modelo;
	private int ano;
	private int potencia;
	private int velocidade;
	
	public CarroCombustao() {
		this.capacidadeTanque = 0;
		this.fabricante = "";
		this.modelo = "";
		this.ano = 0;
		this.potencia = 0;
		this.velocidade = 0;
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando...");
	}
	
	public void frear() {
		System.out.println("Carro freando...");
	}
	
	public void abastecer() {
		System.out.println("Carro abastecendo...");
	}
}
