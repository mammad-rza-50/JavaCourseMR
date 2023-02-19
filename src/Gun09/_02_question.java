package Gun09;

import java.util.Scanner;

public class _02_question {
    public static void main(String[] args) {
        // Girilen bir sayinin negativmi pozitivmi oldugunu yaziniz
        // sifir ise sifir yazdirin
        Scanner sacn = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = sacn.nextInt();
        if(sayi==0)
            System.out.print("sayi = " + sayi + "\nGirilen sayi sifirdir");

        if (sayi<0)
            System.out.println("sayi = " + sayi+"\n Girilen sayi negativdir");

        if (sayi>0 )
            System.out.println("sayi = " + sayi +"\n Girilen sayi pozitivdir");

    }
}
