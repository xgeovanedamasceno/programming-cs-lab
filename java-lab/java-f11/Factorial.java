public class Factorial {
  public static void main(String[] args) {
    int factorial = 1;
    System.out.println("Factorial of 0 is " + factorial);
    for (int n = 1; n <= 10; n++) {
      factorial *= n;
      System.out.println("Factorial of " + n + " is " + factorial);
    }
  }
}
