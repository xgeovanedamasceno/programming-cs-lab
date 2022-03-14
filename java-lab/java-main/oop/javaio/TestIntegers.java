package oop.javaio;


import java.util.ArrayList;
import java.util.List;

public class TestIntegers {
    public static void main(String[] args) {
        int i = 100;
        System.out.println(i + 20);
        String s = "" + i;
        System.out.println(s + 20);

        double d = 1.2;
        System.out.println(d + 2);
        String sd = "" + d;
        System.out.println(sd + 2);

        String sw = "101";
        int ip = Integer.parseInt(sw);
        System.out.println(ip+4);

        //autoboxing
        Integer x = 5;
        int y = x;


    }
}
