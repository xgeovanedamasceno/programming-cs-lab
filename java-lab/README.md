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

*You need to consider what it means to put a value to a Map whilst iterating. HashMap defines no order over which its entries will be iterated over. So when you put a new entry, should the entry be returned by the iterator later or not. Consistency of behaviour is important. However, whichever way you decide you'll get inconsistent behaviour when you put a new value to a preexisting key. If the key has already been iterated over then the change won't appear and will appear if the key has yet to be produced by the iterator.

*A simple way to overcome this problem is to create a temporary Map of the new key-value pairs and add the temporary Map to the main Map at the end of your iteration.

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
