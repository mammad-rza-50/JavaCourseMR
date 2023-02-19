package Repeat_01;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

            // Döngülerde bir işlemi birden fazla yaptırmak istiyoruz.
            // girilen 10 sayının toplamını bulunuz.
            Scanner oku=new Scanner(System.in);

            int sayi1;
            int toplam=0;

            //1 tane sayı bir işlem yaptım

            //bu bölümü tekrarla : tekrar sayısına ihtiyaç, yani sayac,başlangıç değer, bitiş değer , artış değeri olması lazım
            // başlangıcı belli, artışı belli sonu belli : for döngüsü

            for(int i=0; i < 5; i++) {
                // ilk başta başlangıç değer , kontrol, işlem
                // sonraki adımlarda, artış , kontrol , işlem
                System.out.print("Sayi giriniz=");
                sayi1 = oku.nextInt();
                toplam = toplam + sayi1;
            }
            System.out.println("toplam = " + toplam);


            // şu olana kadar tekrar etsin.
            // başlangıcı belli, artışı belli sonu belli değil. Kaç kere döneceği belli değil ise
            // bu while döngüsüdür.
            // kontrol rekrarlanacak bölüme girmeden yapılacaksa while.
            // girdikten sonra yapılacaksa do-while döngüsü.

            System.out.println("***************************");
            // girilen bir sayıya kadar olan sayıların toplamını bulunuz.
            int sinir;
            System.out.print("Hangi sayıya kadar sayılar toplanacak=");
            sinir= oku.nextInt();

            int sayi=0;
            toplam=0;
            while( sayi < sinir ) // döngünün devam şartı
            {
                toplam=toplam+sayi; // 1 2 3 4
                sayi++;
            }
            System.out.println("toplam = " + toplam);

            System.out.println("***************************");
            // kullanıcı 10 değeri girene kadar girdiği sayıları toplayınız.

            sayi=0;
            toplam=0;

            do {
                System.out.print("Sayi giriniz=");
                sayi= oku.nextInt();

                if (sayi!=10)
                    toplam=toplam+sayi;

            }while (sayi != 10);

            System.out.println("toplam = " + toplam);


        }
}
