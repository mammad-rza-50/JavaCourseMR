package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // Baklava dilimiz - >  if
        // Girilen bir 10 dan büyük ise ekrana 10 dan büyük yazdırınız.
        // Algoritma
        //1 - Başla   {
        //2 - sayi oku  sayi=oku.nextInt()
        //3 - sayi > 10 ise "10 dan büyük" yaz ->   if (sayi > 10) sout....
        //4 - Dur


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = scan.nextInt();

        if (sayi>10) {
            // normal parantezler şart
            // if şartı sağlandığında yapılacakların parantezi
            System.out.print("10 dan büyük");
            System.out.println("if in içnde birden fazla komut var ise if parantezleri şarttır");

        }

    }
}


