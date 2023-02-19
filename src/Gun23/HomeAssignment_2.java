package Gun23;

import java.util.Collections;
import java.util.HashSet;

public class HomeAssignment_2 {
    public static void main(String[] args) {

//  2.   changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//     **ÖRNEK:**
//                  hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//                  String 1 = **banana**
//                  String 2 = **peach**
//       **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("ananas");
        fruits.add("pineapple");
        fruits.add("peach");

        String s1 = "pineapple";
        String s2 = "limon";

        changeSet(fruits, s1, s2);

    }

    public static HashSet<String> changeSet(HashSet<String> fruits, String s1, String s2) {

        if (fruits.contains(s1)) {
            fruits.remove(s1);
            fruits.add(s2);
        }
        System.out.println("fruits = " + fruits);
        return fruits;
    }
}
