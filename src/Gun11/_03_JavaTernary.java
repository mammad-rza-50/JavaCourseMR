package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
// Kullanicinin gireceyi sayinin tekmi ciftmi oldugunu yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi gir= ");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0)
            System.out.println("Cift");
            else
            System.out.println("Tek");
       // Daha sade formasi
        String result = (sayi%2 == 0) ? "Cift" : "Tek"; // ?-> if  : -> else
        System.out.println("result = " + result);
    }
}
