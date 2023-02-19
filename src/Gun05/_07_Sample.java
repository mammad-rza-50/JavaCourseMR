package Gun05;

import java.util.Scanner;

public class _07_Sample {
    public static void main(String[] args) {
        //Bir dikdörtgenin gerekli kenar uzunluklarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+b+a+b    alan =a*b

        Scanner scan = new Scanner(System.in);

        int kisaKenar, uzunKenar, alan,cevre;
        System.out.print("Kisakenari giriniz: ");
        kisaKenar = scan.nextInt();

        System.out.print("UzunKenari giriniz: ");
        uzunKenar = scan.nextInt();
        alan = kisaKenar*uzunKenar;
        cevre = 2*(kisaKenar+uzunKenar);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
