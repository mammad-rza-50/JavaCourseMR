package Repeat_01;

import java.util.Scanner;

public class Method_Main {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayıların toplamını,ortalamasını ve
        // çarpımını bulunuz

        Scanner oku = new Scanner(System.in);
        int sinir;
        System.out.print("Bir sayı giriniz=");
        sinir = oku.nextInt();

        // toplamlarını bulduk
        int toplam = 0;
        for (int i = 1; i < sinir; i++)
            toplam = toplam + i;

        System.out.println("toplam = " + toplam);

        // çarpimlarını bulduk
        int carpim = 1;
        for (int i = 1; i < sinir; i++)
            carpim = carpim * i;

        System.out.println("carpim = " + carpim);

        // ortalamasını bulalım
        toplam = 0;
        for (int i = 1; i < sinir; i++)
            toplam = toplam + i; // 1,2,3,4 -> 10 / 5

        System.out.println("ortalama = " + (double) toplam / (sinir - 1));


    }
}