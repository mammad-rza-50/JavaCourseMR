package Mentoring2;

import java.util.Scanner;

public class _04_HomeWorkQuestion {
    public static void main(String[] args) {
        // Girilen bir email in uygun formatta olup olmadığını belirten bir program yaziniz

       /* Girilen email için uygunluk koşullari:

         1- Email ".com" ile bitmeli                          //--->   Blackmamed246@gmail.com
         2- Email "@" işareti bulundurmalı
         3- "@" işareti ".com" dan önce olmalı
         4- "@" işareti öncesinde en az 1 karakter olmalı
         5- "@" ile ".com" arasinda en az 1 karakter olmalı      */


        Scanner scan = new Scanner(System.in);
        System.out.print("Email adresi girin: ");        // Sample   Blackmamed246@gmail.com
        String email = scan.nextLine();

        if (email.endsWith(".com")
                  &&
                     email.contains("@")
                      &&
                        email.indexOf("@")<email.indexOf(".com")
                        &&
                           ! email.substring(0,email.indexOf("@")).isEmpty()
                           &&
                             !email.substring(email.indexOf("@")+1,email.length()-4).isEmpty()){

                             System.out.println("Email duzgun yazilib");
        }else
                             System.out.println("Email adresi duzgun yazilmayib");


    }
}
