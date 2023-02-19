package Gun13;

import java.util.Scanner;

public class _12_HomeWorkAssignment4 {
    public static void main(String[] args) {

        //4- Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        int i = 1;
        int toplam =0;
       int sayi = 0;
        while ( i<=20) {
            System.out.print(i + "-Sayi girin= ");
            sayi = scan.nextInt();

            if ((sayi >= 10) && (sayi <= 30)) {
                toplam += sayi;
            }
            i++;
        }
        System.out.println("Toplam = " + toplam);


    }
}
