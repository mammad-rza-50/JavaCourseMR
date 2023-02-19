package Gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {  // en az bir defe calisir
            System.out.print("Sayi girin= ");
            sayi = scan.nextInt();

            toplam+=sayi;

        }while (sayi != 0);

        System.out.println("toplam = " + toplam);

    }
}
