package Mentoring4;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_HomeQuestion {
    public static void main(String[] args) {

//         Ornek 3 : Verilen bir dizide her elemanin kac defa tekrar ettigini bulan programi yaziniz..
//                   int [] numbers = new int [] {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        int[] arrays = new int[]{2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

        Arrays.sort(arrays);
        int count = 0;
        Arrays.sort(args);

        for (int i = 0; i < arrays.length; i++) {
            count = 0;

            for (int j = 0; j < arrays.length; j++) {

                if (arrays[i] == arrays[j]) {
                    count++;
                }
            }
            if (i == 0 && arrays[i + 1] == arrays[i]) {
                System.out.println("Array = " + arrays[i] + " ---> " + count + " kez tekrar");
            }
            if (i == 0 && arrays[i + 1] != arrays[i]) {
                System.out.println("Array = " + arrays[i] + " ---> " + count + " kez tekrar");
            }
            if (i != 0 && arrays[i - 1] != arrays[i]) {
                System.out.println("Array = " + arrays[i] + " ---> " + count + " kez tekrar");
            }
        }
    }
}




