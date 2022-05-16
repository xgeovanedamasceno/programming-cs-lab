# Java Programming Lab

## 1. JAVA, JVM and bytecode

Commands:

- javac + "NameFile.java" to generate bytecode files
- java + "NameFile" to compile bytecode files
- javap -c "NameFile" to show bytecode code

Java code:

```
class MyProgram {
  public static void main(String[] args) {
    System.out.println("Hello there!");
    System.out.println("My first Java Application!");
    System.out.println("Better late than never!\nAs my father used to say!");
  }
}
```

Bytecode:

```
Compiled from "MyProgram.java"
class MyProgram {
  MyProgram();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: ldc           #3                  // String Hello there!
       5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #5                  // String My first Java Application!
      13: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      19: ldc           #6                  // String Better late than never!\nAs my father used to say!
      21: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      24: return
}
```

## 2. Variables and casting

```
double d = 6;
int i = d; // does not compile
```

```
int i = 5;
double nd = i; // does compila
```

casting:

```
double cd = 3.34;
int i = (int) cd;
// i equals to 3
```

## 3. Division by 0

```
float divisionByZero = 2 / 0;
```

Arithmetic Excepetion

```
float divisionByZero = 2 / 0.0
```

Infinity

## 4. ForEach vs iterator (?)

```
        /*temperatures.forEach(temperature -> {
            sum += temperature.getTemperature();
        });*/

        for (Temperature temperature : temperatures) {
            sum += temperature.getTemperature();
        }
```

## 5. Iterator reference

```
        Iterator<Double> iterator = primeList.iterator();

        Double sum = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            System.out.println(next);
            sum += next;
        }
```

## 6. Collection

- Collection é um objeto que agrupa múltiplos elementos dentro de uma unidade e serve para armazenar e processar conjunto de dados de forma eficiente.

## 7. Java List

- Interface List

  - Implementações: ArrayList, LinkedList e Vector

- Interface Queue

  - Implementações: LinkedList e PriorityQueue

- ArrayList

  - This class uses a dynamic array to store the elements in it.
  - With the introduction of **generics**, this class supports the storage of
    all types of objects
  - Performance:
    - Manipulating ArrayList takes more time due to the internal implementation. Whenever
      we remove an element, internally, the array is transversed and the memory bits are
      shifted.
  - This class implements List interface. Therefore, this acts as a list.
  - This class works better when the application demands storing the data and accessing it.

- LinkedList

  - This class uses a doubly linked list to store the elements in it.
  - It supports the storage of all types of objects.
  - Manipulating LinkedList takes less time compared to ArrayList because, in doubly-linked list,
    there is no concept of shifting the memory bits.
    - The list is transversed and the reference link is changed.
  - This class implements both the List Interface and Deque interface. Therefore, it can acts as a list and a dequeue.
  - This class works better when the application demands manipulation of the store data.

## 8. Java Set

- Interface Set

  - Não permite elementos duplicados
  - Não possui índice
  - Implementações:

    - HashSet, LinkedHashSet e TreeSet

  - HashSet

    - HashSet internally uses HashMap to store its elements.
    - It doesn't maintain any order of elements.
    - HashSet gives better performance than LinkedHashSet and TreeSet.
    - HashSet allow maximum one null element.

  - LinkedHashSet

    - LinkedHashSet internally uses LinkedHashMap to store its elements.
    - LinkedHashSet maintain insertion order of elements.
    - The performance of LinkedHashSet is between HashSet and TreeSet.
    - LinkedHashSet also allow maximum one null element.

  - TreeSet

    - TreeSet internally uses TreeMap to store its elements.
    - The TreeSet maintains default natural sorting order.
    - The TreeSet gives less performance than HashSet and LinkedHashSet.
    - The TreeSet doesn't allow even single element.

## 9. Java Map

- Interface Map

  - Elementos únicos (key) para cada valor (value).
  - Implementações: HashTable, HashMap, LinkedHashMap e TreeMap

  - HashMap

    - Time Complexity:
      - O(1)
    - Iteration Order:
      - Random

  - LinkedHashMap
    - Time Complexity:
      - O(1)
    - Iteration Order:
      - sorted according to either insertion order or access order (as specified during construction).
  - TreeMap

    - Time Complexity
      - O(log n)
      - sorted according to either insertion order or access order (as specified during construction).

  - Iteration Order:
    - Random

## 10. Java Streams

- 1. Classe Anônima

  - Uma classe que não recebeu nome e é declarado e instanciado em uma única instrução

- 2. Functional Interface

  - Qualquer interface com SAM (Single Abstract Method)
  - As implementações são tratadas como expressões lambda
    - Comparator
    - Consumer
    - Function
    - Predicate

- 3. Lambda

  - Uma função sem declaração.
  - Em uma função lambda não é necessário colocar um nome, o tipo de retorno e o modificador de acesso.

- 4. Reference Method

  - Novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe de forma funcional.

- 5. Streams API
  - Nova opção para a manipulação de coleções seguindo os princípios da programação funcional.

### Review

- Interfaces que estendem diretamente da interface Collection:

  - List, Set e Queue

- Map

  - é possível ordernar um map pelo valor

- Principal característica da interface List

  - permite adicionar elementos duplicados e garante a ordem de inserção.

- método map()

  - permite converter cada elemento de uma coleção em um outro objeto conforme definição

- Map.put()
  - permite atualizar adicionar e atualizar um elemento em um Map
=======
## 6. Collection vs Colletions

discussion: https://pt.stackoverflow.com/questions/34605/quais-tipos-de-cole%C3%A7%C3%B5es-e-suas-diferen%C3%A7as-em-java#:~:text=Collection%20)%3A%20Que%20%C3%A9%20uma,usados%20com%20subclasses%20de%20Collection%20.

## 7.Map.Entry interface

- Map.Entry<K,V> is a static interface that stores both key and value together in one structure.
- It allows to get both elements (key and value) in a single operation.
- Map.entrySet is an alternative to iterating over map's keys.
- The objects of a Map.Entry class are valid only for the duration of the iteration.

## 8. Map interface vs Map.Entry interface

The diference is that map interface describes a data structure that stores key and values entries. The Map.Entry interface describes the structure of these entries, stores and provides a way of retrieving the associated key and value.

https://stackoverflow.com/questions/39065527/difference-between-map-and-map-entryk-v-interface

## 9. Comparator vs Comparable

Comparable interface:

- a comparable object is capable of comparing itself with another object.
- is meant for objects with natural ordering which means the object itself must know it is to be ordered.
- it compares "this" reference with the object specified.
- any class that implements Comparable can be sorted automatically by using Collections.sort() or Arrays.sort() method and objects will be sorted based on there natural order defined by CompareTo method.
- it allows only one comparison.

Comparator interface:

- it's a separate class.
- comparator is external to the element that is comparing.
- is necessary to create multiple separate classes that implements Comparator to compare by diffrent members.
- sort is done through a separate class.
- it compares two diffrent class objects provided.
- it's possible to create customs comparators for a given type.

https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/

## 10. How to add a new element while iterating over a map

\*You need to consider what it means to put a value to a Map whilst iterating. HashMap defines no order over which its entries will be iterated over. So when you put a new entry, should the entry be returned by the iterator later or not. Consistency of behaviour is important. However, whichever way you decide you'll get inconsistent behaviour when you put a new value to a preexisting key. If the key has already been iterated over then the change won't appear and will appear if the key has yet to be produced by the iterator.

\*A simple way to overcome this problem is to create a temporary Map of the new key-value pairs and add the temporary Map to the main Map at the end of your iteration.

```
Map<String, Integer> personsMap = new HashMap<>(); // original map

Map<String, Integer> temp = new HashMap<>();

for (Map.Entry<String, Integer> entry : personsMap.entrySet()) {
    if (entry.getKey().equalsIgnoreCase("Mateus")) {
        entry.setValue(25);
    } else {
        Person px = new Person("Mateus", 25);
        temp.put(px.getName(), px.getAge());
    }
}

personsMap.putAll(temp);
```

from: https://stackoverflow.com/questions/27753184/java-hashmap-add-new-entry-while-iterating#:~:text=How%20to%20add%20new%20entry%20while%20iterating%3F&text=Create%20a%20new%20Map%3CString,by%20using%20map%20%3D%20foo%3B%20.

+++: https://www.geeksforgeeks.org/how-to-check-if-a-key-exists-in-a-hashmap-in-java/

erro de lógica no código acima.

## 11. Diference between a variable and an object

- Uma variável é um espaço de memória.
- Um objeto é uma estrutura de código que representa um elemento ou um componente.
- Um objeto é uma representação do mundo real.

## 12. List of links to check

- [ ] https://www.devmedia.com.br/java-streams-api-manipulando-colecoes-de-forma-eficiente/37630
- [ ] https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
- [ ] https://www.alura.com.br/artigos/streams-e-datas-para-os-desafios-do-dia-a-dia-no-java-8?gclid=CjwKCAjw7IeUBhBbEiwADhiEMTRQX8EtDdI8S_obDlxsqzYdw89xz5g5AQnK__tjDjK7wv8iZjNYshoCI5MQAvD_BwE
- [ ]
