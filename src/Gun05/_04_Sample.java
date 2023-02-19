package Gun05;

import java.util.Scanner;

public class _04_Sample {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.
        Scanner scan = new Scanner(System.in);
        String ad, soyad, tamad;
        System.out.print("Ad girin: ");
        ad = scan.next();
        System.out.print("Soyad girin: ");
        soyad = scan.next();
        //   System.out.println("ad = " + ad);
        // System.out.println("soyad = " + soyad);

        tamad = ad + " " + soyad;
        System.out.print("tamad = " + tamad);
    }
}
