public class App {
    public static void main(String[] args) throws IllegalArgumentException, Exception {
        int idadeUsuario = -8;
        VerificadorDeIdade vDeIdade = new VerificadorDeIdade();

        try {
            vDeIdade.verificarIdade(idadeUsuario);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de parâmetro inválido: " + e.getMessage());
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro genérico: " + e.getMessage());
        } finally {
            System.out.println("Aqui sempre será executado!!!!");
        }

        System.out.println("Programa continua executando...");
    }
}




















// try {
//     vDeIdade.verificarIdade(idadeUsuario);
// } catch (IllegalArgumentException e) {
//     System.out.println("Erro de parâmetro inválido: " + e.getMessage());
// }

// try {
//     vDeIdade.verificarIdade(idadeUsuario);
// } catch (IllegalArgumentException e) {
//     System.out.println("Erro de parâmetro inválido: " + e.getMessage());
// } catch (Exception e) {
//     System.out.println("Erro genérico: " + e.getMessage());
// }

// try {
//     vDeIdade.verificarIdade(idadeUsuario);
// } catch (IllegalArgumentException e) {
//     System.out.println("Erro de parâmetro inválido: " + e.getMessage());
// } catch (Exception e) {
//     System.out.println("Erro genérico: " + e.getMessage());
// } finally {
//     System.out.println("Aqui sempre será executado!!!!");
// }

