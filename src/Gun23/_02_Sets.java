package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

        // SETS
        // HashSet : Hızlı, bunun için kendine göre algoritmik sırada tutar
        // LinkedHashSet : EKLEME SIRASI na göre sıralı tutar.
        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu

        // HashSet : Hızlı, bunun için kendine göre algoritmik sırada tutar

        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("bes");
        hs.add("uc");
        hs.add("dord");
        hs.add("iki");
        System.out.println("hs = " + hs);

        // LinkedHashSet : EKLEME SIRASI na göre sıralı tutar.

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("bes");
        lhs.add("uc");
        lhs.add("dord");
        lhs.add("iki");
        System.out.println("lhs = " + lhs);

        // TreeSet : herzaman içinde SIRALI şekilde tutar, kendinden sortlu

        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("bes");
        ts.add("uc");
        ts.add("dord");
        ts.add("iki");
        System.out.println("ts = " + ts);

    }
}
