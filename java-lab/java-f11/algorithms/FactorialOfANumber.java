package algorithms;

public class FactorialOfANumber {
  public static void main(String[] args) {
    int numberF = 8;
    int factorial = 1;

    factorial = numberF;
    for (int n = 1; n < numberF; n++) {
      factorial = factorial * (numberF - n);
    }
    System.out.println(factorial);
  }
}
