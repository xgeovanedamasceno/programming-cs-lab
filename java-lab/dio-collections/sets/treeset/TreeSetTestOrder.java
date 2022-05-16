package diocollection.sets.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTestOrder {
    public static void main(String[] args) {
        Set<String> flagBrazilColors = new TreeSet<String>();
        flagBrazilColors.add("verde");
        flagBrazilColors.add("amarelo");
        flagBrazilColors.add("branco");
        flagBrazilColors.add("azul");




        System.out.println(flagBrazilColors);

        flagBrazilColors.forEach(el -> System.out.println(el));

    }
}
