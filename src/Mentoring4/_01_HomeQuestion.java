package Mentoring4;

import java.util.Arrays;

public class _01_HomeQuestion {
    public static void main(String[] args) {

       // Ornek 1 : Verilen bir Array de en buyuk elemani bulunuz...

        int [] arrays = new int [] {11, 22, 33, 99, 88, 77};

        Arrays.sort(arrays);

        System.out.println("Arrayin en boyuk eleamni= " + arrays[arrays.length-1]);

    }
}



