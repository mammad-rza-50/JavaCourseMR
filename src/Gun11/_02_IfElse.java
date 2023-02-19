package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
// Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("Otoparkda kac saat kaldiniz: ");
        int saat = scan.nextInt();
        if (saat <= 3) {
            System.out.println("Borcunuz 10 TL");
        }
        else
        {
            if (saat <= 5)
                System.out.println("Borcunuz 15 Tl");

            else

                System.out.println("borcunuz 20 Tl");
        }
    }
}
