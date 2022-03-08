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
    return "Checking Account";
  }

  @Override
  public String recoverDataForPrinting() {
    String superData = super.recoverDataForPrinting();
    return superData;
  }

}
