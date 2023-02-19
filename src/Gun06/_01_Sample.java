package Gun06;

import java.util.Scanner;

public class _01_Sample {
    public static void main(String[] args) {
        // Kullanıcıdan Cadde, Sokak , PostaKodu(int) ve ülke şeklinde
// adres bilgisi alarak yazdırınız.

        Scanner scanStr = new Scanner(System.in);    // String okumalarını yap
        Scanner scanInt = new Scanner(System.in);     // int okumalarını için

        System.out.print("Caddeni giriniz: ");
        String cadde = scanStr.nextLine();

        System.out.print("Sokaki giriniz: ");
        String sokak = scanStr.nextLine();

        System.out.print("PostaKodunu giriniz: ");
        int posCode = scanInt.nextInt();

        System.out.print("Ulkeni giriniz: ");
        String ulke = scanStr.nextLine();

        System.out.println("Adres= " + ulke + "/ " + posCode + "/ " + cadde + "/ " + sokak);

    }

}
