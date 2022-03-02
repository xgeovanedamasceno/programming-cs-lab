public class PyramidOfNumbers {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      int mult = 2;
      System.out.print(i);
      for (int j = i; mult < i + 1; mult++) {
        int result = mult * j;
        System.out.print(" " + result);
      }
      System.out.println();
    }
  }
}
