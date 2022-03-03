package oop.capfour;

public class AccountTest {
  public static void main(String[] args) {
    Account c1 = new Account();
    c1.number = 1;
    c1.holder = "Peterson";
    c1.branch = "5th Avenue";
    c1.openingDate = "02/03/22";
    c1.balance = 200;

    Account c2 = new Account();
    c2.number = 1;
    c2.holder = "Peterson";
    c2.branch = "5th Avenue";
    c2.openingDate = "02/03/22";
    c2.balance = 200;

    System.out.println(c1.recoverDataForPrinting());
    System.out.println();
    System.out.println(c2.recoverDataForPrinting());

    if (c1 == c2)
      System.out.println("same");
    else
      System.out.println("different");

    Account c3 = new Account();
    c3 = c2;

    if (c3 == c2)
      System.out.println("same");
    else
      System.out.println("different");
  }

}
