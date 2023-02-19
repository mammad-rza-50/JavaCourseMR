package Gun10;

import java.util.Scanner;

public class _03_question {
    public static void main(String[] args) {

// Girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print(" Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if (sayi%2==0)
            System.out.println("Sayi ciftdir");
        else
            System.out.println("Sayi tekdir");




    }
}
