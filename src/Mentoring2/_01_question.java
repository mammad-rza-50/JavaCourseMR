package Mentoring2;

import java.util.Scanner;

public class _01_question {
    public static void main(String[] args) {
        // Girilen bir sayinin haftanin hangi gunune geldiyini yazan proqram yazin

        Scanner scan = new Scanner(System.in);
        System.out.print("hafta gunu gir= ");
        int haftaGun = scan.nextInt();

        switch (haftaGun){

            case 1:
                System.out.println("pazartesi");break;
            case 2:
                System.out.println("sali");break;
            case 3:
                System.out.println("carsanba");break;
            case 4:
                System.out.println("persembe");break;
            case 5:
                System.out.println("cuma");break;
            case 6:
                System.out.println("cumaetresi");break;
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("yanlis.....");
        }


    }
}
