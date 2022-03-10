package oop.model;

public class SavingsAccount extends Account {

  public SavingsAccount(Data data, String holder, String branch) {
    super(data, holder, branch);
  }

  public SavingsAccount(Data data) {
    super(data);
  }

  @Override
  public String getType() {
    return "Saving Account";
  }
}
