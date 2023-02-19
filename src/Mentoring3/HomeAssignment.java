package Mentoring3;

import java.util.Scanner;

public class HomeAssignment {
    public static void main(String[] args) {

        // Örnek Soru: Kullanıcıdan bir ülke adı alarak aşağıdaki gibi yazdırınız.

        //  n
        //  an
        //  can
        //  ycan
        //  aycan
        //  baycan
        //  rbaycan
        //  erbaycan
        //  zerbaycan
        //  Azerbaycan

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Olke adi girin= ");
        String country = scan.nextLine();

        for (int i = country.length()-1; i>=0; i--) {

            for (int j =i; j<country.length(); j++) {

                System.out.print(country.charAt(j));
            }
            System.out.println();
        }

    }
}
