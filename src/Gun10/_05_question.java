package Gun10;

import java.util.Scanner;

public class _05_question {
    public static void main(String[] args) {

        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("Cumle yaziniz: ");

        String cumle = scan.nextLine();
        int cumleUzunlugu = cumle.length();
     boolean kelime = cumle.toLowerCase().contains("study");

     if(cumleUzunlugu>10 && kelime==true)
         System.out.println("Evet");
     else
         System.out.println("Hayir");








    }
}
