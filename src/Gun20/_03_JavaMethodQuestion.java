package Gun20;

import java.util.Scanner;

public class _03_JavaMethodQuestion {
    public static void main(String[] args) {

        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        //bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi girin= ");
        int sayi = scan.nextInt();

        int carpim = faktorial(sayi);
        System.out.println("carpim = " + carpim);
        if (carpim % 2 == 0)
            System.out.println("Cift");
        else
            System.out.println("Tek");
    }

    public static int faktorial(int sayi1) {

        int cem = 1;
        for (int i = 1; i < sayi1; i++) {

            cem=cem*i;
        }
        return cem;
    }

}
