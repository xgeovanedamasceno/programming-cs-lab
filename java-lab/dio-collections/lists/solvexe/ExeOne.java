/*
* Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

package diocollection.lists.solvexe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExeOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperatures = new ArrayList<Double>();

        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.println("Type the temperature:");
            Double temperature = scan.nextDouble();
            temperatures.add(temperature);
            count++;
        }

        System.out.println("Showing all temperatures:");
        temperatures.forEach(temp -> System.out.println(temp));

        //calculation of temperatures and showing it average
        Double average = temperatures.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);

        System.out.printf("\nTemperatures' Average: %.1f\n", average);

        //showing temperatures over average
        System.out.println("Temperatures over average:");
        temperatures.stream()
                        .filter(temperature -> temperature > average)
                                .forEach(temperature -> System.out.println(temperature));


        System.out.println("Temperatures' Months over Average");
        Iterator<Double> iterator = temperatures.iterator();

        int flag = 1;

        while (iterator.hasNext()){
            Double temp = iterator.next();
            if (temp > average) {
                switch (flag) {
                    case (1):
                        System.out.printf("1 - January: %.1f", temp);
                        System.out.println();
                        break;
                    case (2):
                        System.out.printf("2 - February: %.1f", temp);
                        System.out.println();
                        break;
                    case (3):
                        System.out.printf("3 - March: %.1f", temp);
                        System.out.println();
                        break;
                    case (4):
                        System.out.printf("4 - April: %.1f", temp);
                        System.out.println();
                        break;
                    case(5):
                        System.out.printf("5 - May: %.1f", temp);
                        System.out.println();
                        break;
                    case (6):
                        System.out.printf("6 - June: %.1f", temp);
                        System.out.println();
                        break;
                    default:
                        System.out.println("There was no temperature above average");
                }
            }
            flag++;
        };
    }
}
