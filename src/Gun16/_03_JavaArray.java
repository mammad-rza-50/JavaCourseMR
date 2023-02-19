package Gun16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] Array = new int[5];
        int[] Array1 = {7,12,14,16,25};

        String[] words = new String[5];
       boolean[] isHave = new boolean[5];
       double[] ondalik = new double[5];

        for (int i = 0; i < Array.length; i++) {
            System.out.println("Array = " + Array[i]);
            for (int j = 0; j < Array1.length; j++) {
                System.out.println("Array1 = " + Array1[j]);
            }
        }
        for (int i = 0; i < words.length ; i++) {
            System.out.println("words = " + words[i]);
        }
        for (int i = 0; i <isHave.length; i++) {
            System.out.println("isHave = " + isHave[i]);
        }
        for (int i = 0; i < ondalik.length; i++) {
            System.out.println("ondalik = " + ondalik[i]);
        }



    }
}
