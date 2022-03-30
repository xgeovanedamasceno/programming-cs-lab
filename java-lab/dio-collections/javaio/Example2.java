package diocollection.javaio;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight, high, valueIMC;

        System.out.println("Say your weight in Kg:");
        weight = input.nextDouble();

        System.out.println("Say your high in meters:");
        high = input.nextDouble();

        System.out.println();

        valueIMC = weight / (high * high);
        String statusIMC = null;

        if (valueIMC < 20) statusIMC = "Skinny";
        else if (valueIMC >= 20 && valueIMC < 25) statusIMC = "Healthy";
        else if (valueIMC >= 25 && valueIMC < 29) statusIMC = "Over weight";
        else if (valueIMC >= 30 && valueIMC < 34) statusIMC = "Obese";
        else if (valueIMC > 34) statusIMC = "Very Obese";


        System.out.printf("IMC = %.2f (%s)\n", valueIMC, statusIMC);


    }
}
