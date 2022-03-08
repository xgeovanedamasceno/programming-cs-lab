package oop.interfaces;

public class Manager extends Employee implements Authenticable {
  private String password;

  @Override
  public double getBonus() {
    return this.salary * 1.4 + 1000;
  }

  @Override
  public boolean auth(String password) {
    if (this.password != password) {
      return false;
    }
    return true;
  }
}
