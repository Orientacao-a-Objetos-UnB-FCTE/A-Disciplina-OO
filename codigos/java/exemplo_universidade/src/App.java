import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        while (true) { 
            int op = App.mostraMenu();

            if(op == 0) {
                System.out.println("SAINDO...");
                break;
            } else if (op == 1) {
                System.out.print("Digite o nome do aluno: ");
                String nome = sc.nextLine();
                
                System.out.print("Digite a idade do aluno: ");
                int idade =  sc.nextInt();
                sc.nextLine();

                System.out.print("Digite o telefone do aluno: ");
                String telefone = sc.nextLine();

                alunos.add(new Aluno(nome, idade, telefone, 10001));
            } else if (op == 2) {
                App.listarAlunos(alunos);
            } else {
                System.out.println("Digite uma opção válida!");
            }
        }
    }

    public static int mostraMenu() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("0 -> SAIR");
        System.out.println("1 -> CADASTRAR ALUNO");
        System.out.println("2 -> LISTAR ALUNOS");
        int op = sc.nextInt();
        sc.nextLine();

        return op;
    }

    public static void listarAlunos(ArrayList<Aluno> alunos) {
        System.out.println("----- LISTA DE ALUNOS -----");
        System.out.println("Número de alunos: " + alunos.size());
        for(int idx = 0; idx < alunos.size(); idx++) {
            alunos.get(idx).imprimeDados();
        }
    }
}
