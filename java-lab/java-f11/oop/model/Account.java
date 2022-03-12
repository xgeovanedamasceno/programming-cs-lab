package oop.model;

public abstract class Account implements Comparable<Account> {
  static int number;
  private int id;
  private String holder;
  private String branch;
  private double balance;
  private Data openingDate;
  protected String Type = "Account";

  public Account() {

  }

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

  @Override
  public String toString() {
    String data = "\nNumber Account: " + this.id + "\n" +
    "Opening Date: " + this.openingDate.formatedData() + "\n" +
    "Holder: " + this.holder + "\n" +
    "Balance: " + this.balance + "\n" +
    "Type: " + this.getType() + "\n";
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

  public double getBalance() {
    return balance;
  }

  public abstract String getType();

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (!(obj instanceof Account))
      return false;

    Account otherAccount = (Account) obj;
    return (this.holder == otherAccount.holder && this.branch.equals(otherAccount.branch));
  }

  @Override
  public int compareTo(Account otherAccount) {
    return this.holder.compareTo(otherAccount.holder);
  }
}
