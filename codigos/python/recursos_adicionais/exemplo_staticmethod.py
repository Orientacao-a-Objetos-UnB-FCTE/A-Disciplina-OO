class Calculadora:
    def __init__(self, valor_inicial=0):
        self.valor = valor_inicial

    def adicionar(self, numero):
        """Adiciona um número ao valor da instância."""
        self.valor += numero
        return self.valor

    @staticmethod
    def somar(a, b):
        """
        Método estático para somar dois números.
        Não acessa atributos da instância (self) nem da classe (cls).
        """
        # Este método não precisa de 'self' ou 'cls'
        return a + b

    @staticmethod
    def subtrair(a, b):
        """
        Método estático para subtrair dois números.
        Funciona como uma função regular, mas está logicamente agrupado à classe.
        """
        return a - b

# --- Exemplos de uso ---

# Instanciando a classe (o método estático não precisa disso)
calc_instancia = Calculadora(10)
print(f"Valor inicial da instância: {calc_instancia.valor}")
print(f"Adicionando 5: {calc_instancia.adicionar(5)}")
print("-" * 30)

# Chamando o método estático diretamente da classe
# Não é necessário criar uma instância de Calculadora para usar somar/subtrair
resultado_soma = Calculadora.somar(5, 3)
print(f"Soma (5 + 3) usando staticmethod: {resultado_soma}")

resultado_subtracao = Calculadora.subtrair(10, 4)
print(f"Subtração (10 - 4) usando staticmethod: {resultado_subtracao}")
print("-" * 30)

# Também pode ser chamado através de uma instância, mas a instância não é usada
resultado_soma_via_instancia = calc_instancia.somar(10, 20)
print(f"Soma (10 + 20) via instância (mas operando na classe): {resultado_soma_via_instancia}")