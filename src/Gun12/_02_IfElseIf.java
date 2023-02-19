package Gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi 1 girin= ");
        int sayi1 = scan.nextInt();

        System.out.print("Sayi 2 girin= ");
        int sayi2 = scan.nextInt();

        System.out.println("Toplama ucun T");
        System.out.println("Cixma ucun C");
        System.out.println("Vurma ucun P");
        System.out.println("Bolme ucun B");
        Scanner scanStr = new Scanner(System.in);
        String islem = scanStr.nextLine();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("Toplam = " + (sayi1 + sayi2));
        else if (islem.equalsIgnoreCase("C"))
            System.out.println("Cixma = " + (sayi1 - sayi2));
        else if (islem.equalsIgnoreCase("P"))
            System.out.println("Vurma = " + (sayi1 * sayi2));

        else if (islem.equalsIgnoreCase("B"))
            System.out.println("Bolme = " + (double)(sayi1 / sayi2));

        else
            System.out.println("Sehv secim");


    }
}
