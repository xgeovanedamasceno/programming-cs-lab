package oop.capnine.seven.model;

public class CheckingAccount extends Account {

  public CheckingAccount(Data data, String holder, String branch) {
    super(data, holder, branch);
  }

  public CheckingAccount(Data data) {
    super(data);
  }

  @Override
  public void withDrawMoney(double amount) {
    super.withDrawMoney(amount);
  }

  @Override
  public String getType() {
    return super.getType() + " Checking Account";
  }

  @Override
  public String recoverDataForPrinting() {
    String previousText = super.recoverDataForPrinting();
    previousText = previousText + this.getType();
    return previousText;
  }

}
