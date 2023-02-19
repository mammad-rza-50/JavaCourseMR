package Mentoring3;

import java.util.Scanner;

public class _02_Sample {
    public static void main(String[] args) {

        // Girilen 3 basamakli bir sayinin birler, onlar ve yuzler basamagini bulun

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayi yaziniz= ");
        int sayi = scan.nextInt();

        int basamak;
        int sayac = 1;
        while (sayi > 0) {
            basamak = sayi % 10;
            System.out.println(sayac + "-lar basamagi = " + basamak);
            sayi /= 10;

            sayac *= 10;

        }
    }
}
