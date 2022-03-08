package oop.basictwo;

public class House {
  String color;
  boolean doorOne;
  boolean doorTwo;
  boolean doorThree;

  void paint(String color) {
    this.color = color;
  }

  int howManyDoorAreOpen() {
    int quantity = 0;

    if (doorOne)
      quantity++;
    if (doorTwo)
      quantity++;
    if (doorThree)
      quantity++;

    return quantity;
  }

}
