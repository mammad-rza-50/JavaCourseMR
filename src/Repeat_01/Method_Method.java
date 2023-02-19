package Repeat_01;

import java.util.Scanner;

public class Method_Method {
    public static void main(String[] args) {
        // girilen bir sayıya kadar olan sayıların toplamını,ortalamasını ve
        // çarpımını bulunuz

        Scanner oku = new Scanner(System.in);
        int sinir;
        System.out.print("Bir sayı giriniz=");
        sinir = oku.nextInt();

        toplamBul(sinir);

        Math.random();
        Math.min(5, 4);

        // bir öğrenci class yazdın.
        // içinde kimlikYaz() metodu var;
//        Student ogr1=new Student();
//        ogr1.ad="ismet";
//        ogr1.kimlikYaz();

    }

    public static void toplamBul(int sinir) {
        int toplam = 0;
        for (int i = 1; i < sinir; i++)
            toplam = toplam + i;

        System.out.println("toplam = " + toplam);
    }
}