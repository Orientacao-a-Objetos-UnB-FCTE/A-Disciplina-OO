class Animal:
    def __init__(self, nome=""):
        self.nome = nome

    def comer(self):
        return f'O {self.nome} está comendo...'


class Cachorro(Animal):
    def __init__(self, nome, raca="", idade=None):
        super().__init__(nome)
        self.raca = raca
        self.idade = idade
    
    def get_raca(self):
        return self.raca

    def latir(self):
        return f'O cachorro {self.nome} está latindo!'


meu_cachorro = Cachorro(raca="Golden", idade=90, nome="Mike")
# meu_cachorro = Cachorro("Tótó", "Vira-lata", 15)
print(meu_cachorro.latir())
print(f'Raça: {meu_cachorro.get_raca()}')
print(f'Idade: {meu_cachorro.idade}')

