package Gun21;

import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayListQuestion {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();
        double toplam = 0;
        String devamMi;

        do {
            // notu girecek
            System.out.print("Not girin= ");
            int not = scanInt.nextInt();
            // notlari ArrayListe elave edir
            notlar.add(not);
            // girilen notlari topla
            toplam += not;
            // davam etmek isteyirmisen E/H
            System.out.println("Notu tekrar girmek istermisin EVET, HAYIR: ");
            devamMi = scanStr.next();
        } while (devamMi.equalsIgnoreCase("E"));
        // ortalamayi tap
        double orta = toplam / notlar.size();
        // kecen sayisis\ni tap
        int kecenSayi = 0;

        for (int i = 0; i < notlar.size(); i++) {

            if (notlar.get(i) > orta)
                kecenSayi++;
        }
        System.out.println("Orta = " + orta);
        System.out.println("KecenSayi = " + kecenSayi);


    }
}
