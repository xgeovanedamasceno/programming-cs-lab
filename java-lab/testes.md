## Asserts

- Afirmação
- Assertions para tipos primitivos, objetos e arrays
- Ordem dos parâmetros: valor esperado, valor retornado

## Rules

Um componente que intercepta uma chamada para um método do teste e permite que façamos algo antes ou após o método roda.

Todas as classes do JUnit 4 implementam interfaces - OrgJunitRulesTestRule

Com Rules podemos fazer:

- Criar arquivos que serão deletados após o método ser executado
- Falhar um teste se um timeout específico exceder antes de ser executado
- configurar um recurso externo como um socket ou uma conexão com o banco de dados antes do método ser executado.
- Liberar o recurso no final.

Testando exceções:

- exceções esperadas
- exceções esperadas rules
- Try/Catch idiom
  - fail dentro do block try

-assertThat -> matchers

### Review

Como são chamados os pequenos passos do desenvolvimento no TDD?

- babysteps

AssertEquals verifica se:

- o valor esperado e atual são iguais.

O que é TDD?

- uma método de desenvolvimento de software.

Testes unitários são usados para:

- Testar uma única funcionalidade da aplicação.

Qual das afirmações abaixo sobre razões para usar mocks é verdadeira?

- criar/simular objetos reais para testes é difícil.

Qual afirmativa sobre rules é verdadeira:

- podemos criar arquivos e diretórios que serão deletados após o método ser executado.

Por que o TDD proporciona um código mais limpo?

- por favorecer a criação de códigos menores e testáveis.

Quais abordagens são utilizadas para testar exceptions?

- expected exceptions, expected exceptions rules e try/catch idiom.

PowerMockit é uma API de extensão que permite trabalhar com:

- reflection

Qual das afirmações abaixo é verdadeira sobre limitações no uso de mocks?

- Tipos primitivos, objetos e arrays.
