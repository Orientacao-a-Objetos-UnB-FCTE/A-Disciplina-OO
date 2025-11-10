class Livro:
    def __init__(self, titulo, autor, paginas=0):
        self.titulo = titulo
        self.autor = autor
        self.paginas = paginas

    def __str__(self):
        """
        Método mágico chamado por str() e print().
        Define a representação em string "formal" do objeto.
        """
        return f'"{self.titulo}" por {self.autor}, {self.paginas} páginas'
    
    def __len__(self):
        """
        Método mágico chamado por len().
        Define o "comprimento" do objeto, aqui o número de páginas.
        """
        return self.paginas
    
    def __del__(self):
        """
        Método mágico chamado quando o objeto está prestes a ser destruído (garbage collected).
        (Não use para liberar recursos críticos, prefira 'with' e context managers).
        """
        print(f"Livro '{self.titulo}' sendo removido da memória.")


# --- Exemplos de uso ---

meu_livro = Livro("A Revolução dos Bichos", "George Orwell")

# Usando __str__ implicitamente com print()
print(str(meu_livro))
# Saída: "A Revolução dos Bichos" por George Orwell, 150 páginas

print("-" * 20)

# Usando __len__ implicitamente com len()
print(f"O livro tem {len(meu_livro)} páginas.")
# Saída: O livro tem 150 páginas.

print("-" * 20)

# Quando o objeto não tem mais referências, __del__ pode ser chamado
# (o momento exato depende do garbage collector)
del meu_livro
print(meu_livro)
# A saída de __del__ pode aparecer aqui ou mais tarde, dependendo do coletor de lixo
