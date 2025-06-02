### 1. Letra C. **"Facilitar a adição de novos tipos de pagamento sem alterar o código existente."**

### 2. Letra E - **"Todas estão corretas"**

### 3. Letra D - **"Prova de Cálculo 1 sendo aplicada…"**

### 4. Letra C - **"Falta de Coesão nos Métodos."**

### 5. Letra C - **"Tornar atributos privados e fornecer métodos públicos para acesso controlado."**

### 6. Resposta abaixo

---

✅ **a) O que é uma classe? (0,5 pontos)**

> Uma classe é um modelo (ou molde) que define os atributos (dados) e métodos (comportamentos) de um objeto. Ela representa um conceito ou entidade do mundo real, e os objetos são instâncias concretas dessa classe.

---

✅ **b) Exemplo de classe em Java com 3 atributos e métodos get/set (1 ponto)**

```java
public class Computador {
    private String marca;
    private int memoriaRAM;
    private double preco;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }
    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
```

---

✅ **c) Dois construtores: com e sem parâmetros (1 ponto)**

```java
// Construtor sem parâmetros
public Computador() {
    this.marca = "Desconhecida";
    this.memoriaRAM = 0;
    this.preco = 0.0;
}

// Construtor com parâmetros
public Computador(String marca, int memoriaRAM, double preco) {
    this.marca = marca;
    this.memoriaRAM = memoriaRAM;
    this.preco = preco;
}
```

---

✅ **d) Sobrescrita do método `toString()` (1 ponto)**

```java
@Override
public String toString() {
    return "Computador [Marca: " + marca + ", Memória RAM: " + memoriaRAM + "GB, Preço: R$" + preco + "]";
}
```

---

✅ **e) Main com duas instâncias, alteração de atributo, chamada ao `toString()` (1,5 pontos)**

```java
public class Main {
    public static void main(String[] args) {
        // Instância sem parâmetros
        Computador pc1 = new Computador();

        // Instância com parâmetros
        Computador pc2 = new Computador("Dell", 16, 4500.0);

        // Alteração de um atributo da instância com parâmetros
        pc2.setPreco(4200.0);

        // Exibindo informações usando toString()
        System.out.println(pc1.toString());
        System.out.println(pc2.toString());
    }
}
```

---