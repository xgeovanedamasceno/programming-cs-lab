package diocollection.maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> carsName = new ArrayList<>(){{
            add("Bettle");
            add("Onix");
            add("Mercedes");
        }};

        Map<String, Double> cars = new HashMap<>(){
            {
                put("Ferrari", 15.7);
                put("Mobi", 17.5);
                put("Hb20", 11.7);
                put("Kwid", 17.5);
                put("Porche", 4.9);
            }
        };

        System.out.println("Cars");
        System.out.println(cars);

        System.out.println();
        System.out.println("Replace a value");
        cars.put("Ferrari", 10.0);
        System.out.println(cars);


        System.out.println("Ferrari is in the Map: " + cars.containsKey("Porche") );

        System.out.println("Show the value of Porche: " + cars.get("Porche"));

        System.out.println();
        System.out.println("Show the keys: ");
        Set<String> nameCarsModels = cars.keySet();
        System.out.println(nameCarsModels);

        System.out.println();
        System.out.println("Show the key's values");
        System.out.println(cars.values());
        Collection<Double> carsValues = cars.values();
        System.out.println(carsValues);
        System.out.println(carsValues instanceof Collection);

        System.out.println("Max value:");
        Double maxValue = Collections.max(cars.values());
        System.out.println(maxValue);
        Set<Map.Entry<String, Double>> entries = cars.entrySet();
        String modelMax = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maxValue)) {
                modelMax = entry.getKey();
                System.out.println(modelMax);
            }
        }

        System.out.println(cars);






    }
}
