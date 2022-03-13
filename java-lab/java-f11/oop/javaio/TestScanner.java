package oop.javaio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("file.txt");

        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
    }
}
