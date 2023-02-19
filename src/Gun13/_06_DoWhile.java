package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {

        //  kullanici o deyeri girene kadar
        // bir bir sayilarin toplamini girin

        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        System.out.print("Sayi girin= ");
        sayi = scan.nextInt();

        while (sayi != 0)
        {

            System.out.print("Sayi girin= ");
           sayi = scan.nextInt();

            toplam+=sayi;

        }

        System.out.println("toplam = " + toplam);
    }
}
