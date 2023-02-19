package Gun11;

import java.util.Scanner;

public class _04_question {
    public static void main(String[] args) {
//Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin= ");
        int sayi = scan.nextInt();
        String result = ( sayi>50) ? "bir" : "sifir";
        System.out.println("result = " + result);






    }
}
