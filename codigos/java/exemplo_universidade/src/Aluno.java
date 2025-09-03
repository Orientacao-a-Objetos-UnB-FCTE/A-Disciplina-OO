public class Aluno extends Pessoa {
    private int matricula;
    private int quantidadeCreditos;
    private int semestre;
    private float ira;

    public Aluno() {
        super();
        this.matricula = 0;
        this.quantidadeCreditos = 0;
        this.semestre = 0;
        this.ira = 5.0f;
    }

    public Aluno(String nome, int idade, String telefone, int matricula) {
        super(nome, idade, telefone); // Chama o construtor da classe mãe
        this.matricula = matricula;
        this.quantidadeCreditos = 0;
        this.semestre = 0;
        this.ira = 5.0f;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }

    public void setQuantidadeCreditos(int quantidadeCreditos) {
        this.quantidadeCreditos = quantidadeCreditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getIra() {
        return ira;
    }

    public void setIra(float ira) {
        this.ira = ira;
    }

    @Override
    public void imprimeDados() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Quantidade créditos: " + this.getQuantidadeCreditos());
        System.out.println("IRA: " + this.getIra());
    }
}
