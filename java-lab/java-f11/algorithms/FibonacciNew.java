package algorithms;

public class FibonacciNew {
  public static void main(String[] args) {
    int last = 0;
    int current = 1;
    System.out.print(last + " " + current + " ");
    while (current < 100) {
      current = last + current;
      System.out.print(current + " ");
      last = current - last;
    }
  }
}
