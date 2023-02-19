package Gun10;

import java.util.Scanner;

public class _08_homeWorkQuestion {
    public static void main(String[] args) {

        // yan yana jacaranda bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123


        Scanner scan = new Scanner(System.in);
        System.out.print("Yan yana aralarında bir boslukla  3 int sayı girin: ");
        String sayilar = scan.nextLine();
        int bosluq1 = sayilar.indexOf(" ");
        int bosluq2 = sayilar.lastIndexOf(" ");

        int sayi1 = Integer.parseInt(sayilar.substring(0, bosluq1 ));
        System.out.println("sayi1= " +sayi1);
        int sayi2 = Integer.parseInt(sayilar.substring(bosluq1+1,bosluq2));
        System.out.println("sayi2 = " + sayi2);
        int sayi3 = Integer.parseInt(sayilar.substring(bosluq2 + 1));
        System.out.println("sayi3 = " + sayi3);


        if ((sayi1+sayi2+sayi3) %2 == 0) {
            System.out.println("Girilen sayilarin toplami #Ciftdir#");
        }
        else {
            System.out.println("Girilen sayilarin toplami #Tekdir#");
        }



    }
}
