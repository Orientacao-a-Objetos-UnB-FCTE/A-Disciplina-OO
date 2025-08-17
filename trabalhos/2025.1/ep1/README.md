## Descrição

A **FCTE** está desenvolvendo um sistema acadêmico para gerenciar alunos, disciplinas, professores e turmas presenciais. O objetivo é informatizar o controle de matrícula, carga horária, frequência e desempenho acadêmico, tudo acessível por meio de uma interface via terminal.

Você foi contratado para desenvolver a primeira versão desse sistema, que será utilizada inicialmente pelos funcionários da secretaria acadêmica.

A aplicação deverá conter **três modos principais**:

- **Modo aluno (Normal e Especial)**
- **Modo disciplina/turma**
- **Modo avaliação/frequência**

---

### Modo aluno (Normal e Especial)

Neste modo, o operador poderá:

- Cadastrar e editar alunos com nome, matrícula e curso de graduação;
- Listar os alunos cadastrados;
- Matricular alunos em disciplinas existentes e com vagas disponíveis;
    - Não pode ser matriculado se não tiver os pré-requisitos
- Trancar disciplinas e semestre;
- Salvar e carregar os dados dos alunos e matrículas em arquivos;
- Verificar duplicidade com base na matrícula;
- Caso seja um Aluno Especial, ele possui algumas restrições (pode cursar no máximo 2 disciplinas, não recebe notas, apenas presença).

---

### Modo disciplina/turma

Neste modo, será possível:

- Cadastrar disciplinas (nome, código, carga horária, pré-requisitos);
- Criar turmas com professor responsável, semestre, forma de avaliação, se é presencial ou remota, sala, horário e capacidade máxima de alunos;
    - Cada disciplina pode ter mais de uma turma, desde que em horário diferente.
    - Se for remota não tem sala.
- Listar turmas disponíveis e alunos matriculados em cada uma;
- Salvar e carregar os dados das disciplinas e turmas em arquivos;

---

### Modo avaliação/frequência

Neste modo, o sistema permitirá:

- Lançar notas e presença dos alunos por turma;
    - Podemos considerar que as turmas vão seguir duas formas de avaliação, podendo ser selecionada no cadastro da turma:
        1. Media Final = (P1 + P2 + P3 + L + S) / 5
        2. Media Final = (P1 + P2 * 2 + P3 * 3 + L + S) / 8
        - Onde: P1=Prova 1, P2=Prova 2, P3=Prova 3, L=Listas de Exercício, S=Seminario.
- Calcular média final e frequência;
- Informar se o aluno foi aprovado, reprovado por nota ou por falta;
    - Para ser aprovador precisa de nota maior ou igual a 5 e presença miníma de 75%;
- Exibir relatórios:  
    - Relatórios por turma;
    - Relatórios por disciplina;
    - Relatórios por professor.
- Exibir boletins por aluno:
    - Boletim do aluno separado por semestre;
    - Opção com e sem os dados da turma (professor responsável, se foi presencial ou remota e carga horária);

---

## Orientações Técnicas

O sistema deverá:

- O menu deve permitir voltar ao menu principal e encerrar o programa com segurança. garantindo a persistência dos dados em arquivos.
- Utilizar **herança** de forma coerente;
- Implementar **polimorfismo**;
- Garantir o uso correto de **encapsulamento** e visibilidade de atributos;
- Possuir módulos claros para cada modo da aplicação;
- Armazenar os dados em arquivos (preferencialmente `.txt` ou `.csv`);
- Conter documentação simples em `./README.md` com instruções de execução via terminal;
- Subir um vídeo no repositório/drive/youtube com link no `./README` na raiz do repositório, exemplificando o uso do sistema e mostrando a modelagem de classes utilizadas (máximo de 5 minutos).
- Colocar alguns prints no `./README` do funcionamento do sistema no terminal (3 prints)

---

## Critérios de Avaliação

| ITEM                         | COMENTÁRIO                                                            | VALOR |
| ---------------------------- | --------------------------------------------------------------------- | ----- |
| **Modos da Aplicação**       | Modo aluno, disciplina/turma e avaliação/frequência implementados.    | 1,5   |
| **Armazenamento em arquivo** | Dados persistidos em arquivos e lidos corretamente.                   | 1,0   |
| **Herança**                  | Utilização de Herança (que faça sentido).                             | 1,0   |
| **Polimorfismo**             | Pelo menos três usos de polimorfismo.                                 | 1,0   |
| **Encapsulamento**           | Uso adequado de visibilidade de atributos e métodos.                  | 1,0   |
| **Modelagem**                | Estrutura e relacionamento de classes bem planejados.                 | 1,0   |
| **Execução**                 | O sistema deve compilar corretamente e ser executado por meio de um menu funcional no terminal. Deve haver um script ou instruções claras `./README.md` sobre como compilar e rodar o sistema, incluindo a estrutura de pastas e a classe principal.           | 0,5   |
| **Qualidade do Código**      | Código organizado, limpo e bem nomeado.                               | 1,0   |
| **Repositório**              | Uso de controle de versão, commits frequentes e mensagens claras.     | 1,0   |
| **README**              | Contém vídeo (máx. 5 min) demonstrando o sistema e modelagem, além de 3 prints da execução no terminal.    | 1,0   |
|                              | TOTAL                                                                 | 10    |
| **Pontuação Extra**          | Funcionalidades extras, interface amigável, organização superior.     | 1,5   |
