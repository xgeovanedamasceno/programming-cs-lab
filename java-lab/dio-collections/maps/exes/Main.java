package diocollection.maps.exes;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        FederalState pe = new FederalState("Pernambuco", "PE", 9616621);
        FederalState al = new FederalState("Alagoas", "AL", 3351543);
        FederalState ce = new FederalState("Ceara", "CE", 9187103);
        FederalState rn = new FederalState("Rio Grande do Norte", "RN", 3534265);

        Map<String, Integer> states = new HashMap<>();

        states.put(pe.getInitials(), pe.getPopulation());
        states.put(al.getInitials(), al.getPopulation());
        states.put(ce.getInitials(), ce.getPopulation());
        states.put(rn.getInitials(), rn.getPopulation());

        System.out.println("Original state of map:");
        System.out.println(states);

        for (Map.Entry<String, Integer> state : states.entrySet()) {
            if (state.getKey().equalsIgnoreCase("RN")) {
                state.setValue(7894165);
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
                FederalState pb = new FederalState("Paraíba", "PB", 4039277);
                temp.put(pb.getInitials(), pb.getPopulation());
            }
        }

        states.putAll(temp);
        System.out.println();
        System.out.println("After add a new element");
        System.out.println(states);

        System.out.println();




    }
}
