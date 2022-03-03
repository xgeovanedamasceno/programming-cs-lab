package oop.capfour;

public class Account {
  String holder;
  int number;
  String branch;
  double balance;
  Data openingDate;

  public void withDrawMoney(double amount) {
    this.balance -= amount;
  }

  public void cashDeposit(double amount) {
    this.balance += amount;
  }

  public double calculateFinancialIncome() {
    return this.balance * 0.1;
  }

  public String recoverDataForPrinting() {
    String data = "Number Account: " + this.number + "\n" +
        "Opening Date: " + this.openingDate.data() + "\n" +
        "Holder: " + this.holder + "\n" +
        "Balance: " + this.balance + "\n";
    return data;

  }
}