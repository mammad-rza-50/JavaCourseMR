package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _04_JavaMap {
    public static void main(String[] args) {

     Map<Integer,String> hmAnimals = new HashMap<>();  // Hash silib ancaq  Map<Integer> kimi yazila bilir
        hmAnimals.put(1,"wolf");
        hmAnimals.put(11,"dog");
        hmAnimals.put(17,"cat");
        hmAnimals.put(21,"bird");
        hmAnimals.put(27,"fox");
        hmAnimals.put(41,"lion");
        System.out.println("animals = " + hmAnimals);

       Map<Integer,String> lmAnimals = new HashMap<>();   //Hash silib ancaq Map----
        lmAnimals.put(1,"wolf");
        lmAnimals.put(11,"dog");
        lmAnimals.put(17,"cat");
        lmAnimals.put(21,"bird");
        lmAnimals.put(27,"fox");
        lmAnimals.put(41,"lion");
        System.out.println("lmAnimals = " + lmAnimals);

        Map<Integer,String> tAnimals = new HashMap<>();   //Hash silib ancaq Map----
        tAnimals.put(1,"wolf");
        tAnimals.put(11,"dog");
        tAnimals.put(17,"cat");
        tAnimals.put(21,"bird");
        tAnimals.put(27,"fox");
        tAnimals.put(41,"lion");
        System.out.println("tAnimals = " + tAnimals);



    }
}
