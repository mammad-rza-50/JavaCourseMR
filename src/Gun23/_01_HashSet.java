package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // hafızada 1 sayı saklıyor
        int[] dizi=new int[6]; // hafızada 6 sayı saklar : sabit boyutlu
        int[][] tablo=new int[3][20]; //hafızada 60 sayı saklıyor, 3x20 şeklinde : sabit boyutlu

        // dizi lazım, ama boyutu ekledikçe artsın, sildikçe azalsın
        ArrayList<Integer> liste=new ArrayList<>(); // boyut değişken

        ArrayList< ArrayList<Integer> > listelerinListesi = new ArrayList<>(); // 2 boyutlu, 2 boyutu da değişken


        // Java cım, şu ana kadar verdiğin değişken tipleri için teşekkür ederim,
        // fakat bana öyle bir dizi verki, hem ArrayList gibi olsun, hemde TEKRAR değerleri
        // içine almasın, öyle set ver bana, yani dizi tip ver bana.
        // Java mektubumuza cevap verdi :
        // Sevgili Memmed hiç canını sıkma , bu iş için tasarlanmış SET ler adını verdiğimiz
        // dizilerimiz var dedi.
        // HashSet -> sen ekledikçe hızlı çalışmak için kendine göre bir sıralamada elamanları tutar.
        // LinkedHashSet -> sen ekledikçe , EKLENME SIRASINA göre , elemanlarını saklar.
        // TreeSet -> sen ekledikçe onları herzaman SIRALI tutar dedi.
        // bunların ortak özelliği Hiç TEKRAR değer bulundurmaz.


        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(12);
        hs1.add(42);
        hs1.add(20);
       boolean repeat1 = hs1.add(1); // false
        hs1.add(14);
        hs1.add(25);
        hs1.add(50);
       boolean repeat20 = hs1.add(20); // false

        System.out.println("repeat1 = " + repeat1);
        System.out.println("repeat20 = " + repeat20);
        System.out.println("hs1 = " + hs1);

    }
}
