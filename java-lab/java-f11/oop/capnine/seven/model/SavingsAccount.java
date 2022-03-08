package oop.capnine.seven.model;

public class SavingsAccount extends Account {

  public SavingsAccount(Data data, String holder, String branch) {
    super(data, holder, branch);
  }

  public SavingsAccount(Data data) {
    super(data);
  }

  @Override
  public String getType() {
    return super.getType() + " Saving Account";
  }

  @Override
  public String recoverDataForPrinting() {
    String previousText = super.recoverDataForPrinting();
    previousText = previousText + this.getType();
    return previousText;
  }
}
