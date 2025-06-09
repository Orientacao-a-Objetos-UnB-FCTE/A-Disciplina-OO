class Livro:
    # Atributo da classe que armazena a contagem de todos os livros criados
    numero_de_livros = 0

    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        # A cada nova instância, incrementamos o contador da classe
        Livro.numero_de_livros += 1

    @classmethod
    def contar_livros(cls):
        """
        Método de classe que retorna o número total de livros criados.
        'cls' refere-se à própria classe Livro.
        """
        print(f"Total de livros criados: {cls.numero_de_livros}")
        return cls.numero_de_livros

# Criando algumas instâncias da classe Livro
livro1 = Livro("O Senhor dos Anéis", "J.R.R. Tolkien")
livro2 = Livro("1984", "George Orwell")
livro3 = Livro("Dom Quixote", "Miguel de Cervantes")

# Chamando o método de classe diretamente na classe
Livro.contar_livros()

# Você também pode chamar através de uma instância, mas ele ainda opera na classe
livro1.contar_livros() # Saída será a mesma, pois é um método de classe