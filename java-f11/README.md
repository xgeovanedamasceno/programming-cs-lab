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
