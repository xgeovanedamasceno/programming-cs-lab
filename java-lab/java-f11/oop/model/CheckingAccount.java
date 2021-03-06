package oop.model;

public class CheckingAccount extends Account {

  public CheckingAccount(Data data, String holder, String branch) {
    super(data, holder, branch);
  }

  public CheckingAccount(Data data) {
    super(data);
  }

    public CheckingAccount() {

    }

    @Override
  public void withDrawMoney(double amount) {
    super.withDrawMoney(amount);
  }

  @Override
  public String getType() {
    return "Checking Account";
  }

 

}
