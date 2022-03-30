package diocollection.javaio;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, number;

        System.out.println("Say a number for the multiplication table:");
        number = input.nextInt();

        System.out.println("Results:");
        for (i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", i, number, (i * number));
        }





    }
}
