package oop.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTest {
  public static void main(String[] args) {
    try {
      FileInputStream fileInputStream = new java.io.FileInputStream("file.txt");
      System.out.println(fileInputStream);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
