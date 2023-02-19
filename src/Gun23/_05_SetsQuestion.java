package Gun23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_SetsQuestion {
    public static void main(String[] args) {

        // 10 elemanli diziyi random ( 10 dahil ) sayilarla doldurdukdan sonra
        // tekrarli deyerleri almayacak sekilde yeni bir diziye atiniz

        Integer[] arrays = new Integer[10];

        for (int i = 0; i < arrays.length; i++) {

            arrays[i] = (int) (Math.random() * 11);
        }

        System.out.println("Arrays.toString(arrays) = " + Arrays.toString(arrays));

        HashSet<Integer> hsInt = new HashSet<>();

        for (int i = 0; i < arrays.length; i++) {

            hsInt.add(arrays[i]);
        }
        System.out.println("hsInt = " + hsInt);


        // second way

        HashSet<Integer> hsInt1 = new HashSet<>(Arrays.asList(arrays));
        System.out.println("hsInt1 = " + hsInt1);

        // third way

        HashSet<Integer> hsInt2 = new HashSet<>();
        Collections.addAll(hsInt2, arrays);
        System.out.println("hsInt2 = " + hsInt2);


    }
}
