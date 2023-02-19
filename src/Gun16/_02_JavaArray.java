package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
// 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.


        Scanner scan = new Scanner(System.in);

        int[] notlar = new int[50];
        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu girin= ");
            notlar[i] = scan.nextInt();
            toplam = toplam + notlar[i];
        }
        int orta = toplam / notlar.length;
        int kecenler = 0;

        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] > orta) {
                System.out.println("ortadan boyuk olanlar = " + notlar[i]);
                kecenler++;
            }
            }
            System.out.println("orta = " + orta);
            System.out.println("kecenler = " + kecenler);

        }
    }
