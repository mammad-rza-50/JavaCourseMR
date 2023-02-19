package Gun14;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        // kullanicidan 5 sayi isteyiniz
        // Bu sayilardan 6 ile 10 arasindaki haric digerleri topla

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Bir sayi girin= ");
            int sayi = scan.nextInt();
            if (sayi > 6 && sayi < 10)
                continue;  // calisdigi anda ozunden sonra gelen komutlari pass kecirir
            toplam += sayi;
            System.out.println("toplam = " + toplam);

        }

    }
}
