package Gun13;

import java.util.Scanner;

public class _09_HomeWorkAssignment1 {
    public static void main(String[] args) {

        // 1- Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        int i = 1;
        while (i <= 20) {
            System.out.print(i + "-Sayi giriniz= ");
            int sayi = scan.nextInt();
            if (sayi % 2 == 1)
            { // (sayi%2 !=0) ola biler
                toplam += sayi;
            }
            i++;
        }
        System.out.println("toplam = " + toplam);
    }
}

