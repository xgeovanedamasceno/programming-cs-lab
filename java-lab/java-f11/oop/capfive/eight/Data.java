package oop.capfive.eight;

public class Data {
  private int day;
  private int month;
  private int year;

  Data(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  String data() {
    return this.day + "/" + this.month + "/" + this.year;
  }

}
