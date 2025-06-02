public class App {
    public static void main(String[] args) {
        f1();
    }
    static void f1() {
        try {
            // ...
            f2();
            // ...
        } catch (MinhaExcecao e) {
            // Código de tratamento do erro
            System.out.println("Exceção capturada em f1: " + e.getMessage());
        }
    }
    static void f2() {
        // ...
        f3();
        // ...
    }
    static void f3() {
        // ...
        f4();
        // ...
    }
    static void f4() {
        // ...
        boolean condicaoDeErro = true; // Simulação da condição de erro
        if (condicaoDeErro) {
            throw new MinhaExcecao("Algo deu errado em f4()");
        }
        // ...
    }
    // Definição da exceção personalizada
    static class MinhaExcecao extends RuntimeException {
        public MinhaExcecao(String mensagem) {
            super(mensagem);
        }
    }
}
