package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(14);
        numbers.add(50);
        numbers.add(85);

        System.out.println("Numbers = " + numbers);

        // siralama islemi

        Collections.sort(numbers);
        System.out.println("Sorting numbers = " + numbers);

        // tersine cevir
        Collections.reverse(numbers);
        System.out.println("Reverse numbers= " + numbers);

        // Max, Min deyeri bulmaq

        System.out.println("Max= " + Collections.max(numbers));
        System.out.println("Min= " + Collections.min(numbers));

        // replace
        Collections.replaceAll(numbers, 50, 80);
        System.out.println("numbers = " + numbers);
        // butun elemanlari set etmek

        Collections.fill(numbers, 12);
        System.out.println("numbers = " + numbers);


        // tanimlarken deyer atma
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(7, 20, 14, 12, 80));
        System.out.println("list = " + list);
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("Rzayev", "Memmed", "Aynure", "Nureddin", "Ayhan"));
        System.out.println("listStr = " + listStr);

        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 12, 14, 7, 20, 25, 85, 80);
        System.out.println("list1 = " + list1);

        // diziye direk ArrayListe nece atmaq olar
        Integer[] array = {12, 14, 7, 25};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array));
        System.out.println("list2 = " + list2);
    }

}
