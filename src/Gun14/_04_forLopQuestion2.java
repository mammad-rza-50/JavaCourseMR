package Gun14;

import java.util.Scanner;

public class _04_forLopQuestion2 {
    public static void main(String[] args) {

// kullanıcının gireceği bir rakama kadar 
        // olan sayıların toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int toplam = 0;
        int sayi = scan.nextInt();
        for (int i = 0; i <= sayi;i++) {  // i++
            toplam+=i;                     // toplam=toplam+i;

        }
        System.out.println("toplam = " + toplam);

    }
}