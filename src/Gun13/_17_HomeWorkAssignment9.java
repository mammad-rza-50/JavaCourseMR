package Gun13;

import java.util.Scanner;

public class _17_HomeWorkAssignment9 {
    public static void main(String[] args) {

        //9- Girilen bir sayının tersi olan sayıyı bulunuz yani 124 girildi ise 421 olan sayı elde edilecek.

        Scanner input = new Scanner(System.in); System.out.print("sayı giriniz: "); int sayi = input.nextInt(); int tersi = 0;
        while (sayi > 0){
            tersi *= 10; tersi += sayi % 10;
            sayi /= 10;
        }
        System.out.println("sayının tersi " + tersi);



         /*   Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayi girin= ");   //Sample: 12345
            int sayi = scan.nextInt();
            System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
            while (sayi != 0) {

                System.out.print(sayi % 10);
                sayi /= 10;
        }*/
    }
}