package Gun20;

import java.util.Scanner;

public class _04_JavaMethodQuestion {
    public static void main(String[] args) {

        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup,
        // bunun sonucunu main de yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayi girin= ");
        int sayi1 = scan.nextInt();

        System.out.print("2.Sayi girin= ");
        int sayi2 = scan.nextInt();

        int sonuc = toplam(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);


    }
    public static int toplam(int s1, int s2){

       return s1+s2;

        // 2 yontem ---> kolayi bu
        // int cem = s1+s2;
       // return cem;

    }

}
