class Tecnico:
    def __init__(self, habilidades_tecnicas, **kwargs):
        super().__init__(**kwargs)
        self.habilidades_tecnicas = habilidades_tecnicas

    def trabalhar(self):
        print("Resolvendo problemas técnicos:")
        for habilidade in self.habilidades_tecnicas:
            print(f"- Usando habilidade técnica: {habilidade}")


class Gerente:
    def __init__(self, equipe, **kwargs):
        super().__init__(**kwargs)
        self.equipe = equipe

    def liderar(self):
        print("Liderando a equipe:")
        for membro in self.equipe:
            print(f"- Apoiando {membro}")


# Herança múltipla
class GerenteTecnico(Tecnico, Gerente):
    def __init__(self, nome, habilidades_tecnicas, equipe):
        self.nome = nome
        # Inicializando as duas superclasses explicitamente
        super().__init__(habilidades_tecnicas=habilidades_tecnicas, equipe=equipe)

    def apresentar(self):
        print(f"Sou {self.nome}, um gerente técnico.")
        self.trabalhar()
        self.liderar()


# Teste do exemplo
habilidades = ["Python", "Redes", "Linux"]
equipe = ["Alice", "Bob", "Carlos"]

jose = GerenteTecnico("José", habilidades, equipe)
jose.apresentar()
