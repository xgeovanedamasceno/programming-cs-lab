package oop.capten.one;

public class BonusControl {
  private double totalEmployeesBonus = 0;

  public void register(Employee e) {
    System.out.println("Adding employee bonus: " + e);
    this.totalEmployeesBonus += e.getBonus();
  }

  public double getTotalEmployeesBonus() {
    return totalEmployeesBonus;
  }
}
