package diocollection.sets.exe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCollections {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);
        colors.remove("Red");
        System.out.println(colors);

        colors.add("Brown");

        //1
        for (String color : colors) {
            if (color.startsWith("B")) {
                System.out.println(color);
                /*colors.remove(color);*/
            }
        }

        //2
        for (String color : colors) {
            if (color.startsWith("B")) {
                colors.remove(color);
            }
        }

        //3
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("B")) iterator.remove();
        }
        System.out.println(colors);
    }
}
