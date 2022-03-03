package oop.capfour.fourteen;

public class Door {
  boolean open;
  String color;
  float width;
  float height;
  float depth;

  void open() {
    this.open = true;
  }

  void close() {
    this.open = false;
  }

  void paint(String color) {
    this.color = color;
  }

  boolean isOpen() {
    if (this.open)
      return true;
    else
      return false;
  }
}
