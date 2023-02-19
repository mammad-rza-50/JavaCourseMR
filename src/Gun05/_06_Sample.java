package Gun05;

import java.util.Scanner;

public class _06_Sample {
    public static void main(String[] args) {
//Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz ve yazdırınız.
        // cevre=a+a+a+a    alan =a*a
        int kenar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Karenin kenarini girin: ");
        kenar = scan.nextInt();
        int cevre = 4 * kenar;
        int alan = kenar * kenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
