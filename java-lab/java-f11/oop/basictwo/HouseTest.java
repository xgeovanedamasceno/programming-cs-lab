package oop.basictwo;

public class HouseTest {
  public static void main(String[] args) {
    House myHouse = new House();

    myHouse.paint("Blue");

    System.out.println(myHouse.howManyDoorAreOpen());

    myHouse.doorOne = true;
    myHouse.doorTwo = true;
    myHouse.doorThree = true;

    System.out.println(myHouse.howManyDoorAreOpen());

  }
}
