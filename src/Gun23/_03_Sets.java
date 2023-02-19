package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("RED");

        // ekrana yazmaq
        System.out.println("colors = " + colors);

        // Ekrana tek tek yazmaq
        for (String color : colors) {   // siralamsi duz olmaya bilir
            System.out.println("color = " + color);
        }

        // foreach
        int[] arrays = {42, 25, 14, 7, 12};

        for (int number : arrays) {
            System.out.print(number + " ");
        }

        Iterator sign = colors.iterator();
        while (sign.hasNext()) {  // sirada eleman varsa
            System.out.println("Gosterdiyi element= " + sign.next());
            // .Next isarenin gosterdiyi elemani temsil eder
        }
    }
}