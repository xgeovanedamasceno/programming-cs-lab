package oop.capnine.seven.model;

public class Account {
  static int number;
  private int id;
  private String holder;
  private String branch;
  private double balance;
  private Data openingDate;
  protected String Type = "Account";

  public Account(Data data) {
    this.openingDate = data;
  }

  public Account(Data data, String holder, String branch) {
    Account.number = Account.number + 1;
    this.setId(Account.number);
    this.openingDate = data;
    this.holder = holder;
    this.branch = branch;
  }

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
    String data = "Number Account: " + this.id + "\n" +
        "Opening Date: " + this.openingDate.formatedData() + "\n" +
        "Holder: " + this.holder + "\n" +
        "Balance: " + this.balance + "\n";
    return data;
  }

  private void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public String getBranch() {
    return branch;
  }

  public Data getOpeningDate() {
    return openingDate;
  }

  public String getType() {
    return Type;
  }
}
