package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {

    //  Girilen 20 sayidan sadece pozitiv olaninin
    // toplamini yazdirin

        Scanner scan =new Scanner(System.in);
        int i =1;
        int toplam = 0;

        while (i <=20)
        {
            System.out.print(i +"-Sayi giriniz= ");
            int sayi = scan.nextInt();
            i++;
            if (sayi>0)
                toplam=toplam+sayi;
            else
                System.out.println("Girilen sayi positiv deyil..");

        }

        System.out.println("toplam = " + toplam);



    }
}
