public class Fibonacci {
  public static void main(String[] args) {
    int fib = 0;
    for (int i = 0; fib < 22; i++) {
      if (i == 0) {
        System.out.println(fib);
        continue;
      }
      if (i == 1) {
        System.out.println(fib + i);
        continue;
      }
      fib = (i - 1) + (i - 2);
      System.out.println(fib);
    }
  }
}
