package oop.capten.one;

public class Manager extends Employee {
  @Override
  public double getBonus() {
    return this.salary * 1.4 + 1000;
  }
}
