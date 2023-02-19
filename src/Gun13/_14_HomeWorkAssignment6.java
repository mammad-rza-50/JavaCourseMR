package Gun13;

import java.util.Scanner;

public class _14_HomeWorkAssignment6 {
    public static void main(String[] args) {

        //6- Bir sayı bulmaca oyunu yapılmak isteniyor
        //    bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,
        //
        //   Kullanıcının bu sayıyı bulmak için 3 hakkı olsun. 3 hakkın sonunda da bilemez ise,
        //
        //   bilemediniz yazıp tutulan sayıyı bildirsin.
        //
        //   Eğer bilirse tebrikler yazsın.

        Scanner scan = new Scanner(System.in);
        int randSayi = (int) ((Math.random() * 10) + 10);


        int i = 1;
        while (i <= 3) {
            System.out.print(i + "-Tahmin sayisi girin= ");
            int kulSayi = scan.nextInt();
            i++;
            if ((kulSayi < 10) || (kulSayi > 20))
                System.out.println("Girilen Sayi yanlis!!!. Tahmin sayisi 10-20 arasi olmali.");

            if (randSayi == kulSayi) {
                System.out.println("Tebrikler tahmin sayiyi buldunuz");
                break;
            }
            if (i > 3)
                System.out.println("Bilemediz Tahmin sayi= " + randSayi);
        }

        // basqa yontem

        Scanner oku = new Scanner(System.in);

        int tutulanSayi = (int) (Math.random() * (20 - 10)) + 10;
        int tahminEdilenSayi;
        int sayac = 1;

        do {
// System.out.println(tutulanSayi);
            System.out.print("Tahmin giriniz : ");
            tahminEdilenSayi = oku.nextInt();
            if (tahminEdilenSayi == tutulanSayi) {
                System.out.println("Tebrikler");
                break;

            } else if (tahminEdilenSayi != tutulanSayi && sayac != 3) {
                System.out.println("Bilemediniz tekrar deneyin");
            } else {
                System.out.println("Bilemediniz Tutulan sayi = " + tutulanSayi);
            }

            sayac++;

        } while (sayac <= 3);

    }
}

 /*   Scanner input = new Scanner(System.in); int sayi = (int)(Math.random() * (20 -10)) + 10; int sayac = 1; int tahminSayi;
do {
        System.out.print(sayac + ". tahmininiz nedir: "); tahminSayi = input.nextInt(); if(tahminSayi == sayi){
        System.out.println("TEBRİKLER"); break;
        }else if(tahminSayi != sayi && sayac != 3){
        System.out.println("bilemediniz tekrar deneyin");
        }else{
        System.out.println("Bilemediniz tutulan sayı -> " + sayi);
        }
        sayac++;
        }while (sayac <= 3);
*/




