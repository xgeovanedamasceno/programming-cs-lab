package oop.javalang;

import java.io.PrintStream;

public class StringTest {
    public static void main(String[] args) {
        
        PrintStream myOut = System.out;
        myOut.println("Hello there!");

        String word = "today is Thursday 10!";
        String upperWord = word.toUpperCase();
        System.out.println(upperWord);

        String replacedWord = upperWord.replace("10", "22");
        System.out.println(replacedWord);

        System.out.println("String contains 'Thursday'? > " + word.contains("Thursday"));

        String empty = "  ";
        if (empty.length() == 0) {
            System.out.println("String is empty");
        } else {
            System.out.println(empty);
        }

        
        if (empty.isBlank()) {
            System.out.println("String is Blank");
        } else {
            System.out.println(empty);
        }
        
        if (empty.isEmpty()) {
            System.out.println("String is Empty **");
        } else {
            System.out.println(empty);
        }

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        System.out.println();

        String phrase = "Socorram-me, subi no onibus em Marrocos";

        for (int i = phrase.length() - 1; i >= 0; i--) {
            System.out.print(phrase.charAt(i));
        }

        System.out.println();

        char c = '3';
        int d = c - '0';

        System.out.println(d);

        System.out.println();

        String x = "762";

        for (int i = 0; i < x.length(); i++) {
          int l =  x.charAt(i) - '0';
          System.out.print(l);
        }

        System.out.println();

    }
}
