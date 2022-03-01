public class Fibonacci {
  public static void main(String[] args) {
    int fib = 0;
    int last  = 0;
    int penultimate = 0;
    for (int i = 1; fib < 22; i++) {
      if (i == 0) {
        fib = last - penultimate;
        System.out.println("valor de i " + i);
        System.out.println(fib);
        continue;
      }
      if (i == 1) {
        last = i;
        fib = last + penultimate;
        System.out.println("valor de i " + i);
        System.out.println(fib);
        continue;
      }
      if (i == 2) {
        fib = last + penultimate;
        penultimate = last;
      }
      System.out.println("valor de i eh" + i);
      fib = last + penultimate;
      System.out.println(fib);
      last = fib;
    }
  }
}
