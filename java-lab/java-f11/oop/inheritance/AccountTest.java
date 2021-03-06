package oop.inheritance;

import oop.model.Account;
import oop.model.CheckingAccount;
import oop.model.Data;
import oop.model.SavingsAccount;

public class AccountTest {
  public static void main(String[] args) {

    Data dataToday = new Data(8, 03, 2022);

    Account c1 = new CheckingAccount(dataToday, "Peterson", "5th Avenue");
    c1.cashDeposit(200);
    System.out.println();
    System.out.println(c1);

    System.out.println();
    System.out.println("*******************");
    System.out.println();

    Account c2 = new SavingsAccount(dataToday, "Mary", "6th Avenue");
    c2.cashDeposit(300);

    System.out.println(c2);

  }

}
