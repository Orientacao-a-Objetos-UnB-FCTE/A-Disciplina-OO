# EPF - Projeto Final de Orientação a Objetos - 2025.2

Projeto final da disciplina Orientação a Objetos utilizando Python + Bottle

Utilize o repositório abaixo para criar o seu repositório, através do botão 'Use this template' -> 'Create a new repository':

- [Template Python + Bottle](https://github.com/Orientacao-a-Objetos-UnB-FCTE/epf-python-bottle-template)

## Requisitos Mínimos

1. **Aplicação Web em Python com Bottle**
   - Estrutura MVC (Model-View-Controller)
   - Persistência de dados (JSON, SQLite ou outro banco simples)

2. **Modelagem de Dados**
   - Pelo menos duas classes principais (models) além de uma classe Usuário
   - Implementação dos 4 pilares de OO: Abstração, Encapsulamento, Herança e Polimorfismo

3. **Autenticação de Usuários**
    - A aplicação deverá gerenciar o cadastro de usuários com acesso à funções exclusivas, além das funcionalidades públicas da aplicação.
   - Sistema de cadastro/login

4. **Interface Web**
   - Layout customizado além do básico (usando CSS/Bootstrap/Materialize)

5. **Documentação**
   - README.md contendo:
     - Descrição da solução e funcionalidades
     - Diagrama de classes (Sugestão: [draw.io](https://app.diagrams.net/))
     - Instruções de instalação/execução

## Requisitos para Pontuação Extra

1. **Relações entre Models**
   - Associações entre models (1-1, 1-N, N-N)
   - Implementação de composição/agregação nas models

2. **Sistema de Permissões**
   - Gerência de níveis de permissão por tipo de usuário (usuário, regular, usuário admin, etc)

3. **Bibliotecas Adicionais**
   - Uso de libs adicionais além do bottle

4. **Qualidade do Projeto**
   - Relevância do tema
   - Criatividade na solução
   - Código bem organizado e documentado
   - Tratamento de erros

## Entrega do Projeto

1. **Repositório Git** contendo:
   - Código fonte completo
   - Arquivos estáticos (CSS, JS, imagens)
   - README.md com toda documentação
   - Arquivo requirements.txt com as dependências

3. **Apresentações do trabalho presencial com todos os membros ds grupos**
   - Data da apresentação presencial: **Xx de Novembro/Dezembro a partir das 11:30h (Ordem de chegada)**
      - Tempo de apresentação: 10 minutos (grupo) + 5 minutos de arguição (professor e monitores)
      - Apresentação com código rodando no computador de uma das pessoas da dupla, mostrar as funcionalidades, bibliotecas utilizadas e explicar as partes interessantes do código no VSCode


## Critérios de avaliação

| **Critério**                                      | **Descrição**                                                                 | **Peso (%)** | **Pontuação Máxima**  |
| ------------------------------------------------- | ----------------------------------------------------------------------------- | ------------ | --------------------  |
| 1. Aplicação Web com Bottle + Estrutura MVC       | Uso correto do framework Bottle e separação clara em Model, View e Controller | 15%          | 1,5 pontos            |
| 2. Persistência de Dados                          | Uso de JSON, SQLite ou outro mecanismo funcional de persistência              | 5%           | 0,5 pontos            |
| 3. Modelagem de Dados com OO                      | Uso de no mínimo 3 classes (2 models + Usuário)                               | 10%          | 1,0 pontos            |
| 4. Uso dos 4 Pilares da OO                        | Abstração, Encapsulamento, Herança, Polimorfismo                              | 15%          | 1,5 pontos            |
| 5. Autenticação de Usuários                       | Cadastro, login, e proteção de rotas                                          | 10%          | 1,0 pontos            |
| 6. Interface Web Customizada                      | Estética além do básico (CSS/Bootstrap/Materialize)                           | 10%          | 1,0 pontos            |
| 7. Documentação no README.md                      | Funcionalidades, diagrama de classes e instruções                             | 10%          | 1,0 pontos            |
| 8. Repositório GitHub (organização do repositório) | Código, requirements.txt, arquivos estáticos e estrutura do projeto           | 5%           | 0,5 pontos           |
| 9. Apresentação Presencial                        | Demonstração do sistema rodando e explicação técnica clara                    | 20%          | 2,0 pontos            |
| 10. Pontuação Extra                        | Pode ser atribuído a livre critério do professor baseado na qualidade do projeto, relevância do tema e criatividade.                    | 10%          | 1,0 pontos            |