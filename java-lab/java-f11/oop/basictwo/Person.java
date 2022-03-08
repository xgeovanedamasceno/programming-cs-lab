package oop.basictwo;

public class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void makesBirthday() {
    this.age += 1;
  }

  void showIdentity() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
  }
}
