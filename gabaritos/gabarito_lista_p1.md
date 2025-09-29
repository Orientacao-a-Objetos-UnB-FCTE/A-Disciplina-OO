# Lista de Exercícios P1 - Orientação a Objetos (Java) + Gabarito

---

## 1. Defina o que é Orientação a Objetos (OO)

**Resposta:**  
Paradigma de programação que organiza o software em torno de objetos, que possuem dados (atributos) e comportamentos (métodos).  
O principal objetivo é aproximar o código do mundo real, melhorando a modularidade, a reutilização e a manutenção do software.

---

## 2. Conceitos básicos

**Explique os seguintes conceitos:**

- **Classe:**  
  Modelo ou molde que define atributos e métodos comuns a objetos.

- **Objeto:**  
  Instância de uma classe, representando uma entidade específica.

- **Atributo:**  
  Propriedade ou característica de um objeto.

- **Método:**  
  Ação ou comportamento que um objeto pode executar.

---

## 3. Conceito de classe e um objeto

**O que é uma classe e um objeto? Dê um exemplo simples em Java.**

**Resposta:**  
- **Classe:** Definição abstrata (molde) de um objeto.
- **Objeto:** Instância concreta da classe.

**Exemplo em Java:**
```java
class Pessoa {
    String nome;
    int idade;
}

Pessoa p1 = new Pessoa();
p1.nome = "Maria";
p1.idade = 30;
```

## 4. Associação entre classes
**Explique o que é uma associação entre duas classes e cite um exemplo prático.**

**Resposta:**
Associação é o relacionamento onde uma classe utiliza outra.
Exemplo: Um Aluno associado a uma Universidade (um aluno estuda em uma universidade).

## 5. Criação de classe simples
**Implemente uma classe Apartamento com os atributos indicados e um método exibirInfo().**

**Resposta:**
```java
public class Apartamento {
    double area;
    int quartos;
    int andar;
    double valorDeCompra;
    int vagasDeGaragem;
    boolean temVaranda;

    void exibirInfo() {
        System.out.println("Área: " + area);
        System.out.println("Quartos: " + quartos);
        System.out.println("Andar: " + andar);
        System.out.println("Valor de Compra: " + valorDeCompra);
        System.out.println("Vagas de Garagem: " + vagasDeGaragem);
        System.out.println("Tem Varanda: " + (temVaranda ? "Sim" : "Não"));
    }
}
```

## 6. Herança
**Explique o conceito de herança e implemente duas classes usando herança.**

**Resposta:**
Herança é o mecanismo pelo qual uma classe herda atributos e métodos de outra, promovendo reuso de código.

Exemplo:
```java
class Animal {
    void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Cachorro latindo");
    }
}
```

## 7. Polimorfismo - Sobrecarga
**O que é polimorfismo em OO? Dê um exemplo usando sobrecarga.**

**Resposta:**
Polimorfismo por sobrecarga ocorre quando métodos têm o mesmo nome, mas diferentes parâmetros.

Exemplo:
```java
class Calculadora {
    int soma(int a, int b) {
        return a + b;
    }

    int soma(int a, int b, int c) {
        return a + b + c;
    }
}
```

## 8. Polimorfismo - Sobrescrita
**O que é sobrescrita em OO? Dê um exemplo prático em Java.**

**Resposta:**
Sobrescrita ocorre quando uma subclasse redefine um método da superclasse.

Exemplo:
```java
class Animal {
    void fazerSom() {
        System.out.println("Animal faz som");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Gato miando");
    }
}
```

## 9. Encapsulamento
**O que é encapsulamento? Reescreva a classe Apartamento usando atributos privados e métodos getters e setters.**

**Resposta:**
Encapsulamento é o princípio de esconder os detalhes internos dos objetos, expondo apenas o necessário.

Classe com encapsulamento:
```java
public class Apartamento {
    private double area;
    private int quartos;
    private int andar;
    private double valorDeCompra;
    private int vagasDeGaragem;
    private boolean temVaranda;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public int getVagasDeGaragem() {
        return vagasDeGaragem;
    }

    public void setVagasDeGaragem(int vagasDeGaragem) {
        this.vagasDeGaragem = vagasDeGaragem;
    }

    public boolean isTemVaranda() {
        return temVaranda;
    }

    public void setTemVaranda(boolean temVaranda) {
        this.temVaranda = temVaranda;
    }
}
```

## 10. Relacionamento de agregação
**Explique o que é agregação e crie duas classes em Java que representem esse relacionamento.**

**Resposta:**
Agregação é quando uma classe possui outra, mas elas podem existir independentemente.

Exemplo:
```java
public class Departamento {
    String nome;
}

public class Funcionario {
    String nome;
    Departamento departamento; // Agregação
}
```

## 11. Projeto orientado a objetos
**Desenhe um diagrama de classes e implemente as classes Livro, Usuario e Emprestimo.**

**Resposta:**
- Diagrama de classes simples:

- **Livro**: título, autor, ISBN

- **Usuario**: nome, id

- **Emprestimo**: livro, usuário, dataEmprestimo, dataDevolucao

![Diagrama de Classes](./diagrama_biblioteca.png)

> Classe Livro:
```java
public class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    // Construtor
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
```

> Classe Usuario:
```java
// Classe Usuario
public class Usuario {
    private String nome;
    private int id;

    // Construtor
    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
```

> Classe Emprestimo:
```java
// Classe Emprestimo
public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;

    // Construtor
    public Emprestimo(Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Métodos
    public void realizarEmprestimo() {
        System.out.println("Empréstimo realizado:");
        System.out.println("Livro: " + livro.getTitulo() + " para o usuário: " + usuario.getNome());
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
    }

    public void realizarDevolucao() {
        System.out.println("Devolução realizada:");
        System.out.println("Livro: " + livro.getTitulo() + " devolvido por: " + usuario.getNome());
        System.out.println("Data de Devolução: " + dataDevolucao);
    }
}
```

## 12. Projeto orientado a objetos 2
**Implemente uma Main em Java que instancie pelo menos um objeto de cada uma das classes (`Livro`, `Usuario`, `Emprestimo`) e em seguida realiza um emprestimo e uma devolução.**

**Resposta:**
```java
public class Main {
    public static void main(String[] args) {
        // Criando um livro
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0261102385");

        // Criando um usuário
        Usuario usuario = new Usuario("Alice", 1);

        // Criando um empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, "14/04/2025", "28/04/2025");

        // Realizando o empréstimo
        emprestimo.realizarEmprestimo();

        System.out.println();

        // Realizando a devolução
        emprestimo.realizarDevolucao();
    }
}
```