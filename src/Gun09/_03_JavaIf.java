package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // girilen iki sayidan boyuk olaninin deyerini ekrana yazdirin
        // esit ise esit yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayi girin: ");
        int sayi1 = scan.nextInt();
        System.out.println("Ikinci sayi girin: ");
        int sayi2 = scan.nextInt();
        if(sayi1==sayi2)
            System.out.println("Girilen sayilar esitdir");
        if (sayi1>sayi2)
            System.out.println("Girilen sayi "+sayi1+" boyukdur");
        if (sayi2>sayi1)
            System.out.println("Girilen sayi " +sayi2+" boyukdur");

    }
}
