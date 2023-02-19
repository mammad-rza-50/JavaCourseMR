package Gun14;

import java.util.Scanner;

public class _05_forLoopquestion3 {
    public static void main(String[] args) {

        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        //  carpinin deyeri 10000 kecdiyinde islem dayansin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int toplam = 1;
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            toplam*=i;

            if (toplam>=10000) {
                System.out.println("break calisdi");
                break;
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
