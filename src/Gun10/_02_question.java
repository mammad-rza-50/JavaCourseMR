package Gun10;

import java.util.Scanner;

public class _02_question {
    public static void main(String[] args) {

        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner scan = new Scanner(System.in);

        System.out.print("Vize notunu girin:");

        double vizeNotu = scan.nextDouble();

        System.out.print("Final kelimesini girin:");
        double finalNotu = scan.nextDouble();

        double ortaNOt = (vizeNotu+finalNotu)/2;
         if (ortaNOt>=60)
             System.out.println("Notunuz:= "+ortaNOt +" \n Tebrikler kecdiniz");

else
             System.out.println("Kaldiniz");
        // Süslü parantez kuralı:  sadece 1 satır(;) çalışacak ise zorunlu değil,
        // birden fazla ise zorunlu. Her zaman koyulabilir, hiç bir mahsuru yok


    }
}
