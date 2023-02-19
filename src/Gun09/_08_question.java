package Gun09;

import java.util.Scanner;

public class _08_question {
    public static void main(String[] args) {

        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);
        System.out.print("Şifreniz = ");
        String sifre=oku.nextLine();

        System.out.print("Şifreniz tekrar = ");
        String sifreTekrar=oku.nextLine();

        boolean ayniMi= sifre.equals(sifreTekrar);

        if (ayniMi == true)
            System.out.println("AYNI");

        if (ayniMi == false)
            System.out.println("DEĞİL");

        //2.yöntem
        if (sifre.equals(sifreTekrar) == true)
            System.out.println("AYNI");

        if (sifre.equals(sifreTekrar) == false)
            System.out.println("DEĞİL");

//********************************************************************

        // Kullanicinin 2 kez gireceyi sifrenin ayni oldugunu
        // AYNI ve ya DEYIL seklinde cavaplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("Sifreni giriniz: ");
        int sifre1 = scan.nextInt();
        System.out.println("Sifreni tekrar giriniz: ");
        int sifre2 = scan.nextInt();
        if(sifre1==sifre2)
            System.out.println("Sifreniz AYNI");
        if (sifre1!=sifre2)

            System.out.println("Sifreniz duzgun DEYIL");
//********************************************************************




    }
}
