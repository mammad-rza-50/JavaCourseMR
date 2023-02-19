package Gun05;

import java.util.Scanner;

public class _03_Sample {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız

        System.out.print("Adinizi ve Soyadinizi giriniz: ");
        Scanner scan = new Scanner(System.in);      // okuma işlemini yapacak olan değişken tanımlandı

        String adsoyad = scan.nextLine();          //okuma işlemi bu noktada yapılıyor

        System.out.println("adsoyad = " + adsoyad);   // verinin gerçekten okunabildiğini
        // tekrar ekrana yazarak kontrol ettim.



    }
}
