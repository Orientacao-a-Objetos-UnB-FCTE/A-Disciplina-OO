public class VerificadorDeIdade {
    // Método que lança uma exceção se a idade for inválida
    public void verificarIdade(int idade) throws IllegalArgumentException, Exception {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade negativa é inválida!");
        }
        if (idade < 18) {
            throw new IllegalArgumentException("Idade insuficiente para acessar o serviço!");
        }
        System.out.println("Acesso permitido.");
    }
}
