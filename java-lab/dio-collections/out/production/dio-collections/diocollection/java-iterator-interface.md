# Java Iterator Interface



No Java, um Iterator é uma interface que fornece métodos que permite percorrer uma coleção.

Um Iterator permite percorrer uma coleção* (qualquer tipo de estrutura membro do Collections Framework**).

Os métodos fornecidos pela interface são

- next()

  - retorna o próximo elemento da coleção

  - NoSuchElementException é lançada se não houver mais elementos

- hasNext()

  - retorna um tipo booleano; true se a iteração tem mais elementos.
  - essa função deve ser usada para decidir se o método next() deve ser chamado.
  - IllegalStateException é lançada se o método next() não foi chamado previamente.

- remove()

  - remove o elemento retornado pelo iterador
  - UnSupportedOperationsException é lançada se o iterador não permite a operação de remoção

- forEachRemaining(Consumer<E> action)
  - executa uma ação passada para cada elemento remanescente até que todos os elementos tenham sido processados ou até que a ação tenha lançado uma exceção.
  - o principal objetivo desse método foi tornar o código mais conciso e legível
  - nullPointerException é lançada se a ação é null.



https://www.softwaretestinghelp.com/java/learn-to-use-java-iterator-with-examples/











