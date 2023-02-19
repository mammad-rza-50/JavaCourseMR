package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {

        // Set-->HashSet, LinkedHashSet, TreeSet
        // Map--> HashMap, LinkedHashMap, TreeMap

        // Map = Anahtar + Set , yani anahtarli set

        // Anahtarin tipi Integer, deyerin tipi String olsun

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1980,"Memmed Rzayev");
        hm.put(1985,"Aynure Rzayeva");
        hm.put(2007,"Nureddin Rzayev");
        hm.put(2008,"Ayhan Rzayev");
        hm.put(1961,"Sara Babayeva");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(1980) = " + hm.get(1980));

        System.out.println("hm.containsKey(1985) = " + hm.containsKey(1985));
        System.out.println("hm.containsKey(2000) = " + hm.containsKey(1987));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        hm.remove(1980);
        System.out.println("hm remove 1980 = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm clear= " + hm);

    }
}
