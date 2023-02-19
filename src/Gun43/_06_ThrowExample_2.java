package Gun43;

import java.util.Scanner;

public class _06_ThrowExample_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni sifre yaratmaq");

        System.out.println("Yeni sifreniz");
        String newPassword = scan.nextLine();

        try {

            if (newPassword.length() < 8)
                // bu mesaj ile suni xeta olur
                throw new Exception("Sifre en azi 8 xarakter olmali");

            if (newPassword.length() > 15) // bu mesaj ile suni xeta olur

                throw new Exception("Sifre en cox 15 xarakter olmali");
        } catch (Exception error) {
            // xetalar bir yere toplamib hamisi edilmesi gereken emeliyyatlar
            // bir yerde edilecler, mesela log tutma kimi
            System.out.println("Xahis olunur Diqqet edin!!!");
            System.out.println(error.getMessage());
            //log tutma
        }
        System.out.println("End");
    }
}
