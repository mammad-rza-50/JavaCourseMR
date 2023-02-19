package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

        // 0-5 arası gibi sayılar ürettik, hep sıfırdan başladı
        // 4-9 arası nasıl ürettirirdim
        // Yöntem şu : önce aralık kadar kadar normal üret (9-4)  yani 0-5 arası
        // üretilmiş olan sayıya min sayıyı ekle , üretilmiş sayı + 4
        //  (int)(Math.Random()*(max-min))+min

        //Girilen max ve min aralığında random sayı ürettiririniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Max= ");
        int maxSayi = scan.nextInt();

        System.out.println("Min= ");
        int minSayi = scan.nextInt();

        int rndSayi = (int)(Math.random()*(maxSayi-minSayi))+minSayi;
        System.out.println("rndSayi = " + rndSayi);


    }
}
