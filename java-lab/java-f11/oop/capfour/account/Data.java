package oop.capfour.account;

public class Data {
  int day;
  int month;
  int year;

  String data() {
    return this.day + "/" + this.month + "/" + this.year;
  }
}
