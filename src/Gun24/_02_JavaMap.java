package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1980, "Memmed Rzayev");
        hm.put(1985, "Aynure Rzayeva");
        hm.put(2007, "Nureddin Rzayev");
        hm.put(2008, "Ayhan Rzayev");
        hm.put(1961, "Sara Babayeva");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer i : hm.keySet())
            System.out.print(i + "\t");
        System.out.println();

        for (String s : hm.values())
            System.out.println(s + "\t");

        for (Map.Entry<Integer, String> is : hm.entrySet()){
            System.out.print("is.getValue() = "+ is.getValue()+"--->");
            System.out.println("is.setValue() = " + is.getKey());}

    }

}
