package Gun23;

import jdk.nashorn.internal.ir.IfNode;

import java.util.LinkedHashSet;

public class HomeAssignment_4 {
    public static void main(String[] args) {

//    4.  removing() isminde bir method oluşturun.
//                 Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//                Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//                Return tipi linkedhashset
//        Örneğin,
//              linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//              String 1= Germany
//              String 2 = USA
//              **Germany ve USA 'i sil.**
//                                       Set'i döndür.

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Azerbaijan");
        cities.add("Turkey");
        cities.add("Pakistan");
        cities.add("Ukraine");
        cities.add("Iran");
        cities.add("Canada");
        cities.add("Russia");
        String remove1 = "Iran";
        String remove2 = "Russia";

        removing(cities, remove1, remove2);

    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> cities, String remove1, String remove2) {

        if (cities.contains(remove1)) {
            cities.remove(remove1);
        }
        if (cities.contains(remove2)) {
            cities.remove(remove2);
        }
        System.out.println(cities);
        return cities;
    }


}
