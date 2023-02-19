package Gun12;

import java.util.Scanner;

public class _03_IfElseIfquestion {
    public static void main(String[] args) {

// Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Ders ve Notu girin: ");
      String DersVeNot = scan.nextLine();
      int ind =DersVeNot.indexOf(":");
      int not=Integer.parseInt(DersVeNot.substring(ind+1));
//int not = Integer.parseInt(DersVeNot.replaceAll("[^0-9]","")); //0-9 basqa hamisini sil
        if (not >= 90)
            System.out.println(" A");
        else if (not >= 80)
            System.out.println("B");
        else if (not >= 70)
            System.out.println( "C");
        else if (not >= 60)
            System.out.println("D");
        else if (not >= 50)
            System.out.println("E");
        else if (not >= 40)
            System.out.println("F");
        else
            System.out.println("Maalesef kaldiniz");
    }
}
