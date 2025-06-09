class Celsius:
    """
    Representa uma temperatura em graus Celsius.
    Usa @property para controlar o acesso e a validação da temperatura.
    """
    def __init__(self, temperatura=0):
        """
        Inicializa o objeto Celsius.
        Ao atribuir a 'temperatura', o setter da propriedade é chamado.
        """
        self.temperatura = temperatura

    def para_fahrenheit(self):
        """
        Converte a temperatura de Celsius para Fahrenheit.
        """
        # Ao acessar 'self.temperatura', o getter da propriedade é chamado.
        return (self.temperatura * 1.8) + 32

    @property
    def temperatura(self):
        """
        Getter: Retorna o valor da temperatura.
        Acessa o atributo real "_temperatura".
        """
        print("Obtendo valor...") # Demonstra que o getter está sendo executado
        return self._temperatura # O underscore indica um atributo "privado" por convenção

    @temperatura.setter
    def temperatura(self, valor):
        """
        Setter: Define o valor da temperatura.
        Realiza validação para garantir que a temperatura não seja abaixo do zero absoluto.
        """
        print("Definindo valor...") # Demonstra que o setter está sendo executado
        if valor < -273.15: # Validação: zero absoluto (-273.15°C)
            raise ValueError("Temperatura abaixo de -273.15°C não é permitida")
        self._temperatura = valor # Armazena o valor no atributo "privado"


if __name__ == "__main__":
    # Criando uma instância; o setter é chamado durante a inicialização
    temp = Celsius(25)
    print(f"Temperatura inicial: {temp.temperatura}°C") # Chama o getter

    # Convertendo para Fahrenheit; o getter é chamado internamente
    print(f"Temperatura em Fahrenheit: {temp.para_fahrenheit()}°F")

    # Tentando definir uma temperatura inválida; o setter valida
    try:
        temp.temperatura = -300
    except ValueError as e:
        print(f"Erro ao definir temperatura: {e}")

    # Definindo uma nova temperatura válida
    temp.temperatura = 30
    print(f"Nova temperatura: {temp.temperatura}°C")