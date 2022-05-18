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
