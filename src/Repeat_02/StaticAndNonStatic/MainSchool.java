package Repeat_02.StaticAndNonStatic;

import java.util.Scanner;

public class MainSchool {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int sayi = oku.nextInt();

        MainSchool.tekMiCiftMi(sayi); // static metodlar
        //run olduğunda direk kullanılabilen metdolardır.

        Student ogr1 = new Student();
        ogr1.kimlikYazdir();
        //static OLMAYAN metodlar ise ancak içinde
        // bulunduğu class dan bir tane oluşturularak kullanılabilir.


        Student.ogrSayYazdir(); // static metodlar
        //run olduğunda direk kullanılabilen metdolardır.

    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0)
            System.out.println(" çifttir");
        else
            System.out.println("tektir");
    }
}

