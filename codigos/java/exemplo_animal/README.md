# Diferença entre Interface e Superclasse em Java

👉 **A principal razão para usar uma interface em vez de uma superclasse é quando você quer garantir um comportamento comum entre classes que NÃO têm relação direta (ou não devem ter) de herança.**

## Por que não só superclasse?

- Uma **superclasse** carrega não só métodos (comportamentos) mas também atributos (estado) e, ao herdar, você está dizendo que a subclasse **é um tipo daquela superclasse**.  
  Isso cria uma relação mais rígida (ex: `Cachorro` é um `Animal`).

- **Java só permite herança simples:** você só pode herdar de **uma** superclasse.  
  Se você já está herdando algo, não pode estender outra classe.

## Por que interface?

- Uma **interface** só define *o que deve ser feito* (os métodos), não *como* ou com que atributos.  
  É mais **leve** e **flexível**.

- Você pode **implementar várias interfaces** ao mesmo tempo, o que permite combinar comportamentos diferentes em uma classe.

- Boa para definir **habilidades** ou **funções** que são independentes da hierarquia.  
  **Exemplo:** tanto `Carro` quanto `Drone` podem implementar uma interface `ControlavelRemotamente`, mas não faz sentido eles terem a mesma superclasse só por isso.

## Exemplo prático

Suponha que você tem:

- `Pessoa` (superclasse)
- `Cachorro` (superclasse: `Animal`)

Ambos podem implementar a interface `Corrida`, com o método `correr()`.  
Não faz sentido que `Pessoa` e `Cachorro` tenham uma mesma superclasse só para correr, mas **ambos podem correr** — a interface resolve isso.

---

👉 **Resumo rápido:**

- **Use superclasse** quando as classes têm uma relação forte de **"é um"** (ex: `Gato` é um `Animal`).
- **Use interface** para compartilhar comportamentos entre classes **não relacionadas** ou quando você precisa **misturar comportamentos** sem acoplar demais.
- **List** é uma interface.
- **ArrayList** é uma implementação.
- Use List como tipo de variável para flexibilidade, e ArrayList (ou outra) como implementação concreta.

