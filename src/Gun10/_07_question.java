package Gun10;

import java.util.Scanner;

public class _07_question {
    public static void main(String[] args) {

// yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
        // 45 67

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayilari bir bosluq birakarak girin: ");
        String sayilar = scan.nextLine();
         int bosluqIndex = sayilar.indexOf(" ");
        String strSayi1 = sayilar.substring(0,bosluqIndex);
        String strSayi2 = sayilar.substring(bosluqIndex+1);

        int sayi1 = Integer.parseInt(strSayi1);
        int sayi2 = Integer.parseInt(strSayi2);

        if (sayi1==sayi2)
            System.out.println("Beraber");
        else
            System.out.println("Beraber deyil");



    }
}
