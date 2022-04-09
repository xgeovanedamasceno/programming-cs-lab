package diocollection.maps;

import com.sun.security.jgss.GSSUtil;

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


        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(maxValue)) {
                String modelMax = entry.getKey();
                System.out.println(modelMax + " - " + entry.getValue());
            }
        }


        System.out.println();
        System.out.println("Min Value");
        
        Double minValue = Collections.min(cars.values());

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(minValue)) {
                String minModel = entry.getKey();
                System.out.println(minModel + " - " + entry.getValue());
            }

        }

        System.out.println();
        System.out.println("Sum of values");

        Iterator<Double> iterator = cars.values().iterator();
        Double sumValues = 0d;
        while (iterator.hasNext()) {
            sumValues += iterator.next();
        }

        System.out.println(sumValues);

        System.out.println();
        System.out.println("Average of Values");
        System.out.println(sumValues/cars.size());


        System.out.println();
        System.out.println("Removing keys");
        Iterator<Double> iterator1 = cars.values().iterator();

        System.out.println(cars);

        while (iterator1.hasNext()) {
            if (iterator1.next().equals(17.5)) {
                iterator1.remove();
            }
        }

        System.out.println(cars);

        System.out.println();
        System.out.println("Order of creation");

        Map<String, Double> carsLinkHashMap = new LinkedHashMap<>(){{
            put("Ferrari", 15.7);
            put("Mobi", 17.5);
            put("Hb20", 11.7);
            put("Kwid", 17.5);
            put("Porche", 4.9);
        }};

        System.out.println(carsLinkHashMap);

        System.out.println("Show the map by key order");
        Map<String, Double> carsTree = new TreeMap<>(carsLinkHashMap);
        System.out.println(carsTree);

        System.out.println("Delete cars map");
        cars.clear();

        System.out.println("Cars is Empty? " + cars.isEmpty());






    }
}
