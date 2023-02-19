package Mentoring4;

import java.util.Arrays;

public class _02_HomeQuestion {
    public static void main(String[] args) {

//        Ornek 2 : Verilen bir Array de tekrar eden elemanlari yazdirin...
//                  int [] numbers2 = new int [] {2, 4, 6, 8, 4, 6, 10, 10};

        int[] arrays = new int[]{2, 4, 6, 8, 4, 6, 10, 10};

        for (int i = 0; i < arrays.length; i++) {

            for (int j = i + 1; j < arrays.length; j++) {

                if (arrays[i] == arrays[j])
                    System.out.println("Array= " + arrays[i]);
            }
        }
    }
}

