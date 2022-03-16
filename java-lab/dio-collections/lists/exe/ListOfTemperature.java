package diocollection.lists.exe;

import java.util.ArrayList;
import java.util.List;

public class ListOfTemperature {
    public static void main(String[] args) {
        List<Temperature> temperatures = new ArrayList<>();

        Temperature temp1 = new Temperature(23.0, "1 - January");
        temperatures.add(temp1);

        Temperature temp2 = new Temperature(17.2, "2 - February");
        temperatures.add(temp2);

        Temperature temp3 = new Temperature(14.2, "3- March");
        temperatures.add(temp3);

        Temperature temp4 = new Temperature(37.9, "4 - April");
        temperatures.add(temp4);

        Temperature temp5 = new Temperature(7.1, "5- May");
        temperatures.add(temp5);

        Temperature temp6 = new Temperature(3.1, "6 - June");
        temperatures.add(temp6);

        Double sum = 0d;
        Double averageTemperature = 0d;

        /*temperatures.forEach(temperature -> {
            sum += temperature.getTemperature();
        });*/

        for (Temperature temperature : temperatures) {
            sum += temperature.getTemperature();
        }

        averageTemperature = sum / temperatures.size();

        System.out.println(averageTemperature);

        for (Temperature temperature : temperatures) {
            if (temperature.getTemperature() > averageTemperature) {
                System.out.println(temperature.getMonth() + ": " + temperature.getTemperature());
            }
        }

        System.out.println();




        System.out.println(temperatures);


    }
}
