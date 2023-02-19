package Gun11;

import java.util.Scanner;

public class _07_JavaMathQuestion {
    public static void main(String[] args) {
//  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayini girin= ");
        int sayi1 = scan.nextInt();
        System.out.println("Ikinci sayini girin= ");
        int sayi2 = scan.nextInt();
        System.out.println("Ucuncu sayini girin= ");
        int sayi3 = scan.nextInt();
        int sayi = Math.max(sayi1, sayi2);
        System.out.println("En boyuk= " + Math.max(sayi, sayi3));

        // 2 ci yontem
        int enBoyuk = Math.max(sayi, Math.max(sayi2, sayi3));
        System.out.println("EnBoyuk = " + enBoyuk);

    }
}
