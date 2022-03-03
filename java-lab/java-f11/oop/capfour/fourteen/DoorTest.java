package oop.capfour.fourteen;

public class DoorTest {
  public static void main(String[] args) {
    Door doorOne = new Door(100, 180, 5);

    doorOne.paint("black");

    doorOne.open();
    doorOne.close();

    doorOne.paint("white");
    doorOne.open();

    boolean isOpen = doorOne.isOpen();
    System.out.println(isOpen);

  }
}
