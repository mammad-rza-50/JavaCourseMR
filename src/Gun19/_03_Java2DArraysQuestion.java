package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArraysQuestion {
    public static void main(String[] args) {

        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        int[][] tablo = new int[3][2];
        int tekSayi = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                System.out.print("Sayi girin= ");

                tablo[i][j] = scan.nextInt();

                if (tablo[i][j] % 2 != 0)
                    tekSayi++;
            }
        }
        int[] teklerDizisi = new int[tekSayi];

        tekSayi = 0;

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + " ");
                if (tablo[i][j] % 2 != 0) {
                    teklerDizisi[tekSayi] = tablo[i][j];
                    tekSayi++;
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(teklerDizisi));
    }
}
