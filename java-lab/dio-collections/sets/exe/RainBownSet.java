package diocollection.sets.exe;

import java.util.*;

public class RainBownSet {
    public static void main(String[] args) {
        Set<String> rainBowColors = new HashSet<>();

        rainBowColors.add("Red");
        rainBowColors.add("Orange");
        rainBowColors.add("Yellow");
        rainBowColors.add("Blue");
        rainBowColors.add("Green");
        rainBowColors.add("Dark Blue");
        rainBowColors.add("Purple");

        System.out.println("Showing the set:");
        System.out.println(rainBowColors);
        System.out.println();

        System.out.println("Showing the set's size:");
        System.out.println(rainBowColors.size());
        System.out.println();

        System.out.println("Using Iterator:");
        Iterator<String> iteratorRainBowColors = rainBowColors.iterator();

        while (iteratorRainBowColors.hasNext()) {
            String nextColor = iteratorRainBowColors.next();
            System.out.println(nextColor);
        }
        System.out.println();

        System.out.println("Showing elements by enhanced-for:");
        for (String color: rainBowColors) {
            System.out.println(color);
        }
        System.out.println();

        System.out.println("Priting in order:");
        Set<String> rainBowColorsOrder = new TreeSet<>(rainBowColors);

        for (String color: rainBowColorsOrder) {
            System.out.println(color);
        }
        System.out.println();

        System.out.println("Printing inverse order:");
        List<String> listRainBowColor = new ArrayList<>(rainBowColors);
        Collections.reverse(listRainBowColor);
        for (String color : listRainBowColor) {
            System.out.println(color);
        }
        System.out.println();

        System.out.println("Printing colors that start with letter 'B':");
        for (String color: rainBowColors) {
            if (color.startsWith("B")) System.out.println(color);
        }

        System.out.println();
       /* String color = "Blue";
        rainBowColors.remove(color);
        System.out.println("rainBowColors: " + rainBowColors);

        rainBowColorsOrder.remove(color);
        System.out.println("rainBowColorsOrder: " + rainBowColorsOrder);

        listRainBowColor.remove(color);
        System.out.println("listRainBowColors: " + listRainBowColor);*/

        System.out.println();

        /*System.out.println("Remove all colors that start with letter 'P'");
        for (String colorz : rainBowColors) {
            if (colorz.startsWith("P")) {
                System.out.println(colorz);
                *//*rainBowColors.remove(colorz);*//*
            }
        }
        System.out.println(rainBowColors);*/

        Iterator<String> iteratorColor = rainBowColors.iterator();

        while (iteratorColor.hasNext()) {
            if (iteratorColor.next().startsWith("R")) {
                iteratorColor.remove();
            }
        }
        System.out.println(rainBowColors);
    }
}
