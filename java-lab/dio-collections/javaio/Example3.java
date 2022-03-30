package diocollection.javaio;

import java.io.IOException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) throws IOException  {
        Scanner input = new Scanner(System.in);

        String name;
        char gender;

        System.out.println("Say a name:");
        name = input.nextLine();

        System.out.println("Say the gender:");
        gender = (char) System.in.read();

        System.out.println("Output");
        if (gender == 'M' || gender == 'm') System.out.printf("Welcome Mr. %s.\n", name);
        else System.out.printf("Welcome Ms. %s.", name);

    }
}
