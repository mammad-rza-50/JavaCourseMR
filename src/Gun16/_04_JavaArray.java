package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {

// Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

Scanner scan = new Scanner(System.in);
int[] sayilar = new int[7];
int toplam=0;


        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Sayi girin= ");
          sayilar[i] = scan.nextInt();

            toplam=toplam+sayilar[i];

        }
        int teksayilar =0;

       int orta=toplam/ sayilar.length;

        for (int i = 0; i < sayilar.length ; i++) {

            if ((sayilar[i] > orta) && (sayilar[i] % 2 != 0))
                teksayilar++;
        }
        System.out.println("orta = " + orta);
        System.out.println("teksayilar = " + teksayilar);

    }
}
