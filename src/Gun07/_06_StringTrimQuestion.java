package Gun07;

import java.util.Scanner;

public class _06_StringTrimQuestion {
    public static void main(String[] args) {

        // trim: Stringin basindaki ve sonundaki bosluqlari siler

        String text = "   Hello World    ";

        System.out.println("text = ->" + text+"<-");
        System.out.println("text= -> " + text.trim());




        // Tek seferde girilen bir ad soyadın(tam ad) adını ve soyadını ayırıp,
        // ayrı ayrı yazdırınız. (sadece ad ve soyad)

        Scanner scan = new Scanner(System.in);

        System.out.print("Adiniz ve Soyadizi giriniz = ");
        String FullName = scan.nextLine();
         int bosluqIndex = FullName.indexOf(" ");
         String name = FullName.substring(0,bosluqIndex);
         String surName = FullName.substring(bosluqIndex+1);
        System.out.println("name = " + name);
        System.out.println("surName = " + surName);



    }
}
