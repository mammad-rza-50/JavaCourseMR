package Gun12;

import java.util.Scanner;

public class _06_JavaSwitch {
    public static void main(String[] args) {

        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi = scan.nextInt();
        int tekliklar = sayi%10;

       switch (tekliklar){
           case 0: System.out.println(" sifir");break;
           case 1: System.out.println(" bir");break;
           case 2: System.out.println(" iki");break;
           case 3: System.out.println(" uc");break;
           case 4: System.out.println(" dord");break;
           case 5: System.out.println(" bes");break;
           case 6: System.out.println(" alti");break;
           case 7: System.out.println(" yeddi");break;
           case 8: System.out.println(" sekkiz");break;
           case 9: System.out.println(" doqquz");break;
       }







    }
}
