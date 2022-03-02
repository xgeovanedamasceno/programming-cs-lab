public class Fibonacci {
  public static void main(String[] args) {
    int fib = 0;
    int last = 0;
    int current = 1;
    System.out.print(last + " " + current + " ");
    while (current < 100) {
      fib = last + current;
      System.out.print(fib + " ");
      last = current;
      current = fib;
    }
  }
}
