package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {

        // Girilen 20 sayinin toplmaini ekrana yazdirin

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayac = 1;

        while (sayac<20)
        {
            System.out.print(sayac+ "-Sayi girin= ");
            int sayi = scan.nextInt();
            toplam=toplam+sayi;
            sayac++;
        }
        System.out.println("Toplam= " +toplam);


    }
}
