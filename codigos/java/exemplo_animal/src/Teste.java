
public class Teste {
    public static void main(String[] args) {
        Disciplina minhaDisciplina = new OrientacaoObjetos();
        Disciplina outraDisciplina = new Calculo1();
        minhaDisciplina = outraDisciplina;
        minhaDisciplina.aplicar_prova();
        // System.out.println(minhaDisciplina.toString());
    }
}