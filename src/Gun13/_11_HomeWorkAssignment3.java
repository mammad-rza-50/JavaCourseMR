package Gun13;

import java.util.Scanner;

public class _11_HomeWorkAssignment3 {
    public static void main(String[] args) {

        //3- Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.

        Scanner scan = new Scanner(System.in);

        int toplam = 0;
        System.out.print("Bir sayi girin= ");
        int sayi = scan.nextInt();

    while (sayi>=1){
        toplam+=sayi;
        sayi-=1;
    }
        System.out.println("Toplam = " + toplam);

    }}

 /*   System.out.print("sayı giriniz : ");
    int sayi = input.nextInt(); int sayac = 0; int toplam = 0;
while(sayac <= sayi){
        toplam += sayac;
        sayac++;
    }
System.out.println("toplam = " + toplam);

}
  */