package Gun18;

import java.util.Scanner;

public class _05_Java2DArraysHomeWorkAssignment {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu kullanıcıdan sayı alarak doldurunuz
        // daha sonra ayrı bir döngü de en büyük sayıyı bulunuz.

        Scanner scan = new Scanner(System.in);
        int[][] tablo = new int[2][3];
        int boyukSayi = tablo[0][0];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("Sayi girin= ");
                tablo[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(tablo[i][j] + " ");

                if (boyukSayi < tablo[i][j])
                    boyukSayi = tablo[i][j];
            }
            System.out.println();
        }
        System.out.println("BoyukSayi = " + boyukSayi);
    }
}