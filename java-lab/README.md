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
