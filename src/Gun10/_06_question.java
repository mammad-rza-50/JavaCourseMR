package Gun10;

import java.util.Scanner;

public class _06_question {
    public static void main(String[] args) {

// Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner scan = new Scanner(System.in);

        System.out.print("Sifre giriniz: ");
        String sifre = scan.nextLine();
        int sifreUzunluq = sifre.length();
        boolean kelime = sifre.contains("pass");

        if (sifreUzunluq>=8 && sifreUzunluq<=12 && !kelime)
            System.out.println("Sifre kurallara uygun");
        else
            System.out.println("Sifre kurallara uygun deyil");

        // 2.Yöntem
        if (sifre.length() >= 8 && sifre.length() <=12 && sifre.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");


        // 3. Yöntem
        if (sifre.length() >= 8 && sifre.length() <=12 && !sifre.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");












    }
}
