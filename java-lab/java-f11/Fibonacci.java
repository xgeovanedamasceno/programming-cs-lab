public class Fibonacci {
  public static void main(String[] args) {
    int fib = 0;
    int last = 0;
    int current = 1;
    while (current < 22) {
      fib = last + current;
      System.out.println(fib);
      last = current;
      current = fib;
    }
  }
}
