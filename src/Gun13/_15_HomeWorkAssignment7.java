package Gun13;

import java.util.Scanner;

public class _15_HomeWorkAssignment7 {
    public static void main(String[] args) {

        //7- Girilen 3 basamaklı bir sayının birler , onlar ve yuzler basamağını bulunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz : ");
        int sayi = input.nextInt(); int basamak; int sayac = 1;
        while (sayi > 0) {
            basamak = sayi % 10;
            System.out.println(sayac + " ler basamağı = " + basamak);
            sayi /= 10;
            sayac *= 10;
        }
      /*  Scanner scan = new Scanner(System.in);
        System.out.print("3 basamakli sayi girin= ");      //  452
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        System.out.println("Birler basamagi = " + birler);
        int onlar = (sayi % 100) - (sayi % 10);
        System.out.println("Onlar basamagi = " + onlar);
        int yuzler = (sayi - (sayi % 100));
        System.out.println("Yuzler basamagi = " + yuzler);  */


    }
}
