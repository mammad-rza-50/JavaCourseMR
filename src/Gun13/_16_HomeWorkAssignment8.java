package Gun13;

import java.util.Scanner;

public class _16_HomeWorkAssignment8 {
    public static void main(String[] args) {

        //8- Girilen bir sayının kaç basamak olduğunu bulunuz.

        Scanner input = new Scanner(System.in); System.out.print("sayı giriniz: "); int sayi = input.nextInt();
        int sayac = 0; while (sayi > 0){
            sayi /= 10;
            sayac++;
        }
        System.out.println("girilen sayı " + sayac + " basamaklı");


      /*  Scanner scan = new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz= ");         // sample: 12345
        int sayi = scan.nextInt();
        int i = 0;

        while (sayi != 0) {
            sayi = (sayi - (sayi%10)) / 10;
            i++;
            System.out.println(i + "--basamak = " + sayi);

        }
        System.out.println("Girilen sayinin basamaki= " + i); */
    }
}