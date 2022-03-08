package oop.capnine.seven.model;

public class Data {
  private int day;
  private int month;
  private int year;

  public Data(int day, int month, int year) {
    this.fillData(day, month, year);
  }

  private boolean isDataViable(int day, int month, int year) {
    if (day <= 0 || month <= 0) {
      return false;
    }

    int lastDayOfMonth = 31;

    if (month == 4 || month == 6 || month == 9 || month == 11) {
      lastDayOfMonth = 30;
    } else if (month == 2) {
      if (year % 4 == 0) {
        lastDayOfMonth = 29;
      } else {
        lastDayOfMonth = 28;
      }
    }

    if (day > lastDayOfMonth) {
      return false;
    }

    return true;
  }

  public void fillData(int day, int month, int year) {
    if (!isDataViable(day, month, year)) {
      System.out.println("The data " + day + "/" + month + "/" + year + " não existe.");
    } else {
      this.day = day;
      this.month = month;
      this.year = year;
    }
  }

  public String formatedData() {
    return this.day + "/" + this.month + "/" + this.year;
  }

}
