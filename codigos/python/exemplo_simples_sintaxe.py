class Cachorro:
    def __init__(self, nome, raca = 'Vira-Lata'):
        self.__nome = nome
        self.raca = raca
        print(f'O cachorro {self.__nome} foi criado!')

    def set_nome(self, nome):
        self.__nome = nome

    def get_nome(self):
        return self.__nome

    def latir(self):
        return f'{self.__nome} da raca {self.raca} esta latindo!' 

meu_cachorro = Cachorro("Léo")
outro_cachorro = Cachorro("Lyon", "Chow-Chow")

print(meu_cachorro.latir())
print(outro_cachorro.latir())

meu_cachorro.set_nome("Teste")
print(meu_cachorro.get_nome())
print(meu_cachorro.latir())
