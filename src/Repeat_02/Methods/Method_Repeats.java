package Repeat_02.Methods;

import java.util.Scanner;

public class Method_Repeats {
    public static void main(String[] args) {
        // girilen 2 sayıdan büyük olanı yazdırınız.
        //her şey main içinde
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi 1=");
        int s1 = oku.nextInt();
        System.out.print("Sayi 2=");
        int s2 = oku.nextInt();

        if (s1 > s2)
            System.out.println("Sayi 1 büyük");
        else
            System.out.println("Sayi2 büyük");


        /**************************************/
        enBuyukYaz();// ne veri alıyor, ne de gönderiyor
        enBuyukYaz(s1, s2); // veri alıyor, bir şey göndermiyor

        int enb = enBuyukBul(s1, s2); // veri alıyor, veri gönderiyor
        System.out.println("enb = " + enb);

        enb = enBuyukBul(); // veri almıyor, ama geri veri gönderiyor
        System.out.println("enb = " + enb);
    }

    public static void enBuyukYaz() { // ne parametre alıyor, nede bir şey geri gönderiyor
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi 1=");
        int s1 = oku.nextInt();
        System.out.print("Sayi 2=");
        int s2 = oku.nextInt();

        if (s1 > s2)
            System.out.println("Sayi 1 büyük");
        else
            System.out.println("Sayi2 büyük");
    }

    static void enBuyukYaz(int s1, int s2) { // parametre alıyor, bir şey geri göndermiyor
        if (s1 > s2)
            System.out.println("Sayi 1 büyük");
        else
            System.out.println("Sayi2 büyük");
    }

    static int enBuyukBul(int s1, int s2) { // parametre alıyor, veri gönderiyor
        int enb = 0;

        if (s1 > s2)
            enb = s1;
        else
            enb = s2;

        return enb;
    }

    static int enBuyukBul() {
        int enb = 0;

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi 1=");
        int s1 = oku.nextInt();
        System.out.print("Sayi 2=");
        int s2 = oku.nextInt();

        if (s1 > s2)
            enb = s1;
        else
            enb = s2;

        return enb;
    }
}
