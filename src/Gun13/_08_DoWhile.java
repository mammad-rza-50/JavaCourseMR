package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {

        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.


        Scanner scan = new Scanner(System.in);
        String girilen ;

        do {

            System.out.print("Harf giriniz= ");
            girilen = scan.next();
            if (!girilen.equalsIgnoreCase("x"))
            System.out.println("Proqram calisir:..");

        }
                while (!girilen.equalsIgnoreCase("x"));

                    System.out.println("Proqram bitti..");


            }


        }