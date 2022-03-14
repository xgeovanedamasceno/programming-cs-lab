package oop.basic;

public class DoorTest {
  public static void main(String[] args) {
    Door doorOne = new Door();

    doorOne.paint("black");

    doorOne.open();
    doorOne.close();

    doorOne.paint("white");
    doorOne.open();

    boolean isOpen = doorOne.isOpen();
    System.out.println(isOpen);

  }
}
