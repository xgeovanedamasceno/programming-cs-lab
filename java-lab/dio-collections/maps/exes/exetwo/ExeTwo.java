package diocollection.maps.exes.exetwo;

import java.util.*;

public class ExeTwo {
    public static void main(String[] args) {
        int quantity = 100;

        List<Integer> values = new ArrayList<>();
        Random ramNumbers = new Random();

        for (int i = 0; i < quantity; i++) {
            int number = ramNumbers.nextInt(6) + 1;
            values.add(number);
        }

        Map<Integer, Integer> releases = new HashMap<>();
        for (Integer result : values) {
            if (releases.containsKey(result)) {
                releases.put(result, (releases.get(result) + 1));
            } else releases.put(result,1);
        }

        System.out.println("Playing");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValues and Times");
        for (Map.Entry<Integer, Integer> entry : releases.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }


    }
}
