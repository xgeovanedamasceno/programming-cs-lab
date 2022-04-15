package diocollection.maps.exes.ask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> personsMap = new HashMap<>();
        Person p1 = new Person("Daniel", 23);
        Person p2 = new Person("Jose", 61);
        Person p3 = new Person("Maria", 31);

        personsMap.put(p1.getName(), p1.getAge());
        personsMap.put(p2.getName(), p2.getAge());
        personsMap.put(p3.getName(), p3.getAge());

        System.out.println(personsMap);

        Map<String, Integer> temp = new HashMap<>();
        for (Map.Entry<String, Integer> entry : personsMap.entrySet()) {
            if (entry.getKey().equalsIgnoreCase("Mateus")) {
                entry.setValue(25);
            } else {
                Person px = new Person("Mateus", 25);
                temp.put(px.getName(), px.getAge());
            }
        }

        personsMap.putAll(temp);

        System.out.println(personsMap);
    }
}
