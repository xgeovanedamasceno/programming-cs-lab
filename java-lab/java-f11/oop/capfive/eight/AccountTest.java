package oop.capfive.eight;

public class AccountTest {
  public static void main(String[] args) {

    Data dataToday = new Data(8, 03, 2022);

    Account c1 = new Account(dataToday, "Peterson", "5th Avenue");
    c1.cashDeposit(200);

    System.out.println(c1.recoverDataForPrinting());
  }

}
