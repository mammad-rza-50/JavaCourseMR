package Gun09;

import java.util.Scanner;

public class _08_JavaIf_2 {
    public static void main(String[] args) {

        // Kullanıcının 2 kez gireceği şifresinin aynı olduğunu
        // AYNI veya DEĞİL şeklinde cevaplayınız.  (confirm new password)

        Scanner oku=new Scanner(System.in);

        String sifre="MR1980";

        System.out.print("Şifreniz = ");
        String sifre1=oku.next().trim();

        System.out.print("Şifreniz tekrar = ");
        String sifreTekrar=oku.next().trim();


        if (sifre.equals(sifre1) || sifre.equals(sifreTekrar))
            System.out.println("AYNI");

        if (!sifre.equals(sifre1) && !sifre.equals(sifreTekrar))
            System.out.println("DEĞİL");


    }
}
