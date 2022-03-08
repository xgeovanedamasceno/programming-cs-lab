package oop.fibonacci;

public class FibonacciTest {
  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();

    for (int i = 1; i <= 6; i++) {
      int result = fib.calculateFibonacci(i);
      System.out.println(result);

    }
  }
}
