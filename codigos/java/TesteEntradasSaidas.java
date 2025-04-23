import java.util.Locale;
import java.util.Scanner;

public class TesteEntradasSaidas {
	public static void main(String[] args) {
		// Exemplo concatenação de Strings
		String nome = "Lucas", sobrenome = "Boaventura";
		System.out.println("Olá " + nome + " " + sobrenome + "!");
		
		// Prepara o programa para receber entradas do teclado
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		// Leitura de um Inteiro
		System.out.print("Digite um inteiro: ");
		int x = sc.nextInt();
		
		// Leitura de um Float
		System.out.print("Digite um numero com casa decimal (Exemplo 7.9): ");
		float f = sc.nextFloat();
		
		// Leitura de um Double
		System.out.print("Digite mais um numero com casa decimal (Exemplo 88.97888): ");
		double d = sc.nextDouble();
		
		sc.nextLine(); // Limpa o ENTER digitado com o Double
		
		// Leitura de uma frase (até o ENTER)
		System.out.print("Digite uma frase: ");
		String s = sc.nextLine();
		
		// Impressão na tela do que foi lido do teclado
		System.out.println("----------------------\nLeituras do teclado:");
		System.out.println("Inteiro digitado: " + x);
		System.out.println("Float digitado: " + f);
		System.out.println("Double digitado: " + d);
		System.out.println("String digitada: " + s);
	}
}

