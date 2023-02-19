package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni sifre yaratmaq");

        System.out.println("Yeni sifreniz");
        String newPassword = scan.nextLine();

        if (newPassword.length() < 8) {
            System.out.println("Xahis olunur Diqqet edin!!!");
            System.out.println("Sifre en azi 8 xarakter olmali");
            //log tutmaq
        }
        if (newPassword.length() > 15) {
            System.out.println("Xahis olunur Diqqet edin!!!");
            System.out.println("Sifre en cox 15 xarakter olmali");
            //log tutmaq
        }
    }
}
