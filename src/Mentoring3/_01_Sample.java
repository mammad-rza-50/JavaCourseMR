package Mentoring3;

import java.util.Scanner;

public class _01_Sample {
    public static void main(String[] args) {

        // girilen sayinin pozitivmi, pozitivse cift olub olmadigini yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi girin= ");

        int sayi= scan.nextInt();

      //  System.out.println(sayi >=0 ?"pozitiv "+ (sayi % 2 == 0 ? "cift": "tek"):"Neqtiv "+(sayi % 2 == 0 ? "cift": "tek"));

        // basqa yontem

        if (sayi>=0){
            System.out.println("Pozitiv");
        if (sayi % 2 == 0)
            System.out.println("Cift");
    else
            System.out.println("Tek");}
    if (sayi<0){
        System.out.println("Neqtiv");
    if (sayi% 2 ==0)
        System.out.println("Cift");
        else
        System.out.println("Tek");}

    }
}
