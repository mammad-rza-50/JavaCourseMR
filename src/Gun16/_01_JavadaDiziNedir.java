package Gun16;

import java.util.Scanner;

public class _01_JavadaDiziNedir {
    public static void main(String[] args) {

//        int ogrNot; // 1 tane not saklar
//
//        // 50 kişi var
//        int ogr1Not;
//        int ogr2Not;
//        int ogr3Not;
//        //....
//        //....
//        //....
//        int ogr50Not;
//
//        // bana bir tanımlamada BIRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;
//        // ÇÖZÜM :
//        int ogrNot20 = 0;
//        int[] notlar = new int[50]; // 50 tane int saklayabilen notlar isimli değişken
        Scanner scan = new Scanner(System.in);

        int[] notlar = new int[50]; // 50 adet int tuta bilen deisen (array)
        // notlar[0] = 42;
        //  notlar[1] = 45;
        // .......
        // .......
        // notlar[49] = 95;

        //        System.out.println("notlar[0] = " + notlar[0]);
        //  System.out.println("notlar.length = " + notlar.length);

        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Notu girin= ");
            notlar[i] = scan.nextInt();
        }
        for (int i = 0; i < notlar.length; i++) {
            System.out.println(notlar[i]);

        }


    }
}
