package Gun13;

import java.util.Scanner;

public class _10_HomeWorkAssignment2 {
    public static void main(String[] args) {

        //2- Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz
        Scanner scan = new Scanner(System.in);

        int i = 1;
        int toplam = 0;
        while (i <= 20) {

            System.out.print(i + "-Sayi giriniz= ");
            int sayi = scan.nextInt();

            if (sayi % 2 == 1) {//  (sayi % 2 != 0)
                toplam += 1;
            }
            i++;
        }
        System.out.println("toplam = " + toplam);

    }
}
