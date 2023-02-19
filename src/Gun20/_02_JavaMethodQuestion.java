package Gun20;

import java.util.Scanner;

public class _02_JavaMethodQuestion {
    public static void main(String[] args) {

        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayi girin= ");
        int sayi1 = scan.nextInt();

        System.out.print("2.Sayi girin= ");
        int sayi2 = scan.nextInt();

        int enb = enbBul(sayi1, sayi2);
        System.out.println("Enb = " + enb);

    }

    public static int enbBul(int s1, int s2) {

        // 1 yontem
//
//        int donecek;
//        if (s1>s2)
//            donecek = s1;
//        else
//            donecek = s2;
//        return donecek;


        // 2 yontem
//
//        if (s1>s2)
//            return s1;
//        else
//            return s2;

        // 3 yontem

        return s1 > s2 ? s1 : s2;


    }
}
