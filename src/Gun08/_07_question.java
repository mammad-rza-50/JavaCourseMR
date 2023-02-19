package Gun08;

import java.util.Scanner;

public class _07_question {
    public static void main(String[] args) {
        
        // kullanicinin gireceyi 2 sayinin birbirine
        // beraber olub olmadigini yoxlayin

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayini girin: ");
        int sayi1 = scan.nextInt();
        System.out.print("Ikinci sayini girin: ");
          int sayi2 = scan.nextInt();
        System.out.println("(sayi2!=sayi1) = " + (sayi2!=sayi1));

        //2.Yöntem
        boolean esitMi=  (sayi1==sayi2) ;
        System.out.println("esitMi = " + esitMi);

    }
}
