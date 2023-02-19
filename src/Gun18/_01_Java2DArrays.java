package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int sayi = 0;   // tek sayi
        int[] array = new int[100];  // 100 sayi

        int[] ders1Notlari = new int[50];  // 50 neferlik sinifin ders1 notlari
        int[] ders2Notlari = new int[50];
        int[] ders3Notlari = new int[50];   // 0-49 arasi index deyisir

        int[][] butunDersNotlari = new int[3][50];// 3 eded ders 50 nefer oyrenci
                                                  // 3 satir  50 sutun



        butunDersNotlari[0][0] = 50;  // 2D arrayda 0 satir, 0 sutuna 50 deyer verildi

        System.out.println("butunDersNotlari = " + butunDersNotlari[0][0]);

        Scanner scan = new Scanner(System.in);
        butunDersNotlari[0][0] = scan.nextInt();

    }
}
