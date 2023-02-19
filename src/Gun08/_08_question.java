package Gun08;

import java.util.Scanner;

public class _08_question {
    public static void main(String[] args) {
        // girilen bir sayinin tek sayi olub olmadigini yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int sayi = scan.nextInt();

         int kalan = sayi/2;
        System.out.println("Tek mi " + (kalan==1));


        //2.Yöntem
        System.out.println("tek mi "+ (sayi%2 == 1));

        //3.Yöntem
        System.out.println("tek mi "+ (sayi%2 != 0)); // negatif girilme ihtimali
        //sebebi ile bu en doğru , çünkü bir üstte negatif girilirse -1 gelir


    }
}
