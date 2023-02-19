package Gun12;

import java.util.Scanner;

public class _05_SwitchQuestion {
    public static void main(String[] args) {
        // hesab makinesi yaziniz

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
        String islem = scanStr.next();

        switch (islem.toUpperCase()) {
            case "T":
                System.out.println("Toplam = " + (sayi1 + sayi2));
                break;
            case "C":
                System.out.println("Cixma = " + (sayi1 - sayi2));
                break;
            case "P":
                System.out.println("Vurma = " + (sayi1 * sayi2));
                break;
            case "B":
                System.out.println("Bolme = " + ((double) sayi1 / sayi2));
                break;
            default:
                System.out.println("Sehv secim");

        }

    }
}
