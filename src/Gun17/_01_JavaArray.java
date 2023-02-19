package Gun17;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {

        // 50 elemanlı bir dizi tanımlayınız,
        // 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız  yazdırınız.

        int[] elemanlar = new int[50];

        for (int i = 0; i < elemanlar.length; i++) {
            elemanlar[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < elemanlar.length; i++) {
            System.out.println("elemanlar once = " + elemanlar[i]);
        }
        System.out.println("------------------------");

        for (int i = 0; i < elemanlar.length; i++) {

            if (elemanlar[i] % 2 == 0)
                elemanlar[i] = 0;
            else
                elemanlar[i] = 1;
        }

        for (int i = 0; i < elemanlar.length ; i++) {
            System.out.println("elemanlar sonra = " + elemanlar[i]);
        }
    }
}
