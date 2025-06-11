class Animal:
    def __init__(self, nome=""):
        self.nome = nome

    def comer(self):
        return f'O {self.nome} está comendo...'


class Cachorro(Animal):
    def __init__(self, nome, raca, idade=None):
        super().__init__(nome)
        self.raca = raca
        self.idade = idade
    
    def get_raca(self):
        return self.raca

    def latir(self):
        return f'Nome do cachorro {self.nome} esta latindo!'


# meu_cachorro = Cachorro(nome="Tótó", idade=15, raca="Vira-lata")
meu_cachorro = Cachorro("Tótó", "Vira-lata", 15)
print(meu_cachorro.latir())
print(f'Raça: {meu_cachorro.get_raca()}')
print(f'Idade: {meu_cachorro.idade}')

