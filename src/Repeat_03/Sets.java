package Repeat_03;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        int sayi; // 1 tane rakam saklıyor.
        int[] dizi=new int[10]; // 10 tan saklıyor ama boyu sabit
        ArrayList<Integer> liste=new ArrayList<>(); // sen ekledikçe artıyor, dinamik

        // bana öyle bir saklama yeri olsunki tekrar veriyi saklamasın ve dinamik
        // a) kendinde herzamans sıralı olsun : TreeSet
        // b) attığım sırada sıralı olsun     : LinkedHashSet
        // c) tekrarlı olmasında hızlı çalışşsın sıra önemli değil : HashSet

        // kendinden herzaman sıralı,
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(10);
        ts.add(32);
        ts.add(15);
        ts.add(10);

        for (Integer e: ts)
            System.out.println(e);

        // atılma sırasına göre sıralı,
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(32);
        lhs.add(15);
        lhs.add(10);
        System.out.println("lhs = " + lhs);


        // hızlı olmak kendine göre sıralı,
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(32);
        hs.add(15);
        hs.add(10);
        System.out.println("hs = " + hs);
    }
}
