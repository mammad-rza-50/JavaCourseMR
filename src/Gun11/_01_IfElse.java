package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

// Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        if (sayi > 0) {
            System.out.println("Pozitiv");
        } else {                            // ya sıfırdır ya da negatidir

            if (sayi < 0)
                System.out.println("Neqativ");
            else
                System.out.println("Sifir");

        }
        /********************************/
        if (sayi> 0)
            System.out.println("pozitif");

        if (sayi<0)
            System.out.println("negatif");

        if (sayi==0)
            System.out.println("sıfır");




    }
}
