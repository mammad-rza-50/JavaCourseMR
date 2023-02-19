package Mentoring2;

import java.util.Scanner;

public class _02_question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userName = "TechnoStudy";
        String passowrd = "12345";

        System.out.print("Kullanici adi girin= ");
        String kullAd = scan.nextLine();
        System.out.print("Password girin= ");
        String sifre = scan.nextLine();



            if (!(userName.equals(kullAd))&&!(passowrd.equals(sifre))) {
                System.out.println("Kullanici adi ve sifre hatali");

            }else if ((userName.equals(kullAd))&&!(passowrd.equals(sifre))) {
                System.out.println("Sifre hatali");
            } else if (!(userName.equals(kullAd))&&(passowrd.equals(sifre))) {

                System.out.println("Kullanici adi hatali");
            }
            else
                System.out.println("Sisteme giris basarili");
            }
    }

