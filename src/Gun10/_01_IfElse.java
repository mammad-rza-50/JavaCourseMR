package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50 den büyük eşit ise geçtiniz.
        // küçük ise kaldınız yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Notu girin=");
        int oyrenciNotu = scan.nextInt();

        // 1 yontem
        if (oyrenciNotu>=50)
            System.out.println("Gecdiniz");
        if (oyrenciNotu<50)
            System.out.println("Kaldiniz");

        // 2 yontem
        if (oyrenciNotu>=50 ) {  // herzaman tek bir kontrol yapar   : baklava dilimi
            System.out.println("Gecdiniz");
            System.out.println("Congratulation");
        }
        else{   //  değilse yapılacaklar


            System.out.println("Kaldiniz");

        }



    }
}
