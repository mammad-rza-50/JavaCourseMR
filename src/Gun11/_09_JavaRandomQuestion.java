package Gun11;

import java.util.Scanner;

public class _09_JavaRandomQuestion {
    public static void main(String[] args) {
// Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi siniri= ");
        int sayi = scan.nextInt();
        int randomSayi = (int) (Math.random()*sayi);
        System.out.print("Reqem girin= ");
        int tahmin = scan.nextInt();
        if (tahmin==randomSayi)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemediniz");

    }
}
