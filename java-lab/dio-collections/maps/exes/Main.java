package diocollection.maps.exes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        FederalState pe = new FederalState("Pernambuco", "PE", 10);
        FederalState al = new FederalState("Alagoas", "AL", 20);
        FederalState ce = new FederalState("Ceara", "CE", 40);
        FederalState rn = new FederalState("Rio Grande do Norte", "RN", 50);

        Map<String, Integer> states = new HashMap<>();

        states.put(pe.getInitials(), pe.getPopulation());
        states.put(al.getInitials(), al.getPopulation());
        states.put(ce.getInitials(), ce.getPopulation());
        states.put(rn.getInitials(), rn.getPopulation());

        System.out.println("Original state of map:");
        System.out.println(states);

        for (Map.Entry<String, Integer> state : states.entrySet()) {
            if (state.getKey().equalsIgnoreCase("RN")) {
                state.setValue(55);
            }
        }

        System.out.println();
        System.out.println("After Modification");
        System.out.println(states);

        /*//Fail
        for (Map.Entry<String, Integer> state : states.entrySet()) {
            if (state.getKey().equalsIgnoreCase("PB")) {
                state.setValue(4039277);
            } else {
                StateFederal pb = new StateFederal("Paraíba", "PB", 4039277);
                states.put(pb.getInitials(), pb.getPopulation());
            }
        }*/

        Map<String, Integer> temp =  new HashMap<>();
        for (Map.Entry<String, Integer> entry : states.entrySet()) {
            if(!entry.getKey().equalsIgnoreCase("PB")) {
                FederalState pb = new FederalState("Paraíba", "PB", 5);
                temp.put(pb.getInitials(), pb.getPopulation());
            }
        }

        states.putAll(temp);
        System.out.println();
        System.out.println("After add a new element");
        System.out.println(states);

        System.out.println();

        FederalState sx = new FederalState("Pernambuco", "PE", 25);
        states.put(sx.getInitials(), sx.getPopulation());

        System.out.println();
        System.out.println("Add or update an element");
        System.out.println(states);


        System.out.println();
        System.out.println("Show the population of PE");
        Integer population = states.get("PE");
        System.out.println(population);

        System.out.println();
        System.out.println("Priting Key and Value");
         for (Map.Entry<String, Integer> statesEntry : states.entrySet()) {
             System.out.println("Key: " + statesEntry.getKey() + " - Value: " + statesEntry.getValue() );
         }

        System.out.println();
        System.out.println("Insertion Order");
        Map<String, Integer> statesLink = new LinkedHashMap<>();
        statesLink.put(pe.getInitials(), pe.getPopulation());
        statesLink.put(al.getInitials(), al.getPopulation());
        statesLink.put(ce.getInitials(), ce.getPopulation());
        statesLink.put(rn.getInitials(), rn.getPopulation());

        System.out.println(statesLink);

        System.out.println();
        System.out.println("Alphab order");
        Map<String, Integer> statesTree = new TreeMap<>(states);
        System.out.println(statesTree);

        System.out.println();
        System.out.println("Show the State with less and more population");
        Collection<Integer> zpopulation = states.values();
        String maxPop;
        String minPop;
        for (Map.Entry<String, Integer> entry : states.entrySet()) {
            if (entry.getValue().equals(Collections.min(zpopulation)))
                System.out.println("State: " + entry.getKey() + " MinPop: " + entry.getValue());
            if (entry.getValue().equals(Collections.max(zpopulation)))
                System.out.println("State: " + entry.getKey() + " MaxPop: " + entry.getValue());
        }

        int sum = 0;
        Iterator<Integer> iterator = states.values().iterator();
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("Show the average");
        System.out.println(sum/states.size());

        System.out.println();
        System.out.println("Remove values less than 20");
        System.out.println(states);
        Iterator<Integer> it = states.values().iterator();
        it.forEachRemaining(state -> {
            if (state < 20) it.remove();
        });

        System.out.println(states);

        System.out.println();
        System.out.println("Cleaning Map");
        states.clear();
        System.out.println(states);
        System.out.println(states.isEmpty());









    }
}
