package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {

        String[] names = {"ahmet","mehmet","zeyneb","fatime","ali"};

         // Arrayi string olarak direk yazir
        System.out.println("names = " + Arrays.toString(names));
        // array siralama

        Arrays.sort(names);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        // arraylar berabermi?
        int[] a={1,12,7,14};
        int[] b={1,12,7,14};
        int[] c={1,14,12,7};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));

        Arrays.sort(c);   // sayi bazli array siralamasi

        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));


        // contains kimi calisdir, varsa pozitiv yoksa neqativ rakam verir

        System.out.println("Arrays.binarySearch(b,4) = " + Arrays.binarySearch(b,4));
        Arrays.sort(b);
        System.out.println("Arrays.binarySearch(b,12) = " + Arrays.binarySearch(b,12));





    }
}
