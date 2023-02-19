package Gun05;

import java.util.Scanner;

public class _05_Sample {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        a = scan.nextInt();
        System.out.print("Sayi giriniz:");
         b = scan.nextInt();
        int c=a+b;
        System.out.println("c = " + c);

    }
}
