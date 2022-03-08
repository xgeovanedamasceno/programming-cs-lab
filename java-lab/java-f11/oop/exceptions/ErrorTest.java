package oop.exceptions;

public class ErrorTest {
  public static void main(String[] args) {
    System.out.println("Start of Main");
    try {
      methodOne();
    } catch (NullPointerException e) {
      System.out.println("error: " + e);
    }
    System.out.println("End of Main");

  }

  static void methodOne() {
    System.out.println("Start of MethodOne");
    methodTwo();

    System.out.println("End of MethodOne");
  }

  static void methodTwo() {
    System.out.println("Start of MethodTwo");
    Data today = new Data(8, 03, 2022);
    Account c1 = new CheckingAccount(today);

    for (int i = 0; i <= 15; i++) {
      c1.cashDeposit(i + 1000);
      System.out.println(c1.getBalance());
      if (i == 5) {
        c1 = null;
      }
    }

    System.out.println("End of MethodTwo");
  }
}
