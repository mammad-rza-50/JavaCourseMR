package Mentoring2;

import java.util.Scanner;

public class _03_question {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi isik yaniyor?");
        String isig = scan.nextLine();

        if (isig.equalsIgnoreCase("REd"))
        {
            System.out.println("Dur");
        } else if (isig.equalsIgnoreCase("YELLOW"))
        {
            System.out.println("hazirlan");

        }
        else if (isig.equalsIgnoreCase("GREEN"))
        {
            System.out.println("kece bilirsin");
        }

        else
        {
            System.out.println("Hatali reng girdiniz.....");
        }
        }}

