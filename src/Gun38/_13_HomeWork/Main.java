package Gun38._13_HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Apple apple = new Apple();
        System.out.print("Apple smatfonun yaddasini secin (64/128(Gb))= ");
        String appCap = scan.nextLine();
        System.out.print("Apple smatfonun ekran olcusunu secin(5.5/6.5(inch))= ");
        String appScr = scan.nextLine();
        apple.options(appCap, appScr);

        Samsung samsung = new Samsung();
        System.out.print("Samsung smatfonun yaddasini secin (256/512(Gb))= ");
        String samCap = scan.nextLine();
        System.out.print("Samsung smatfonun ekran olcusunu secin(5.5/7.5(inch))= ");
        String samScr = scan.nextLine();
        samsung.options(samCap, samScr);

        System.out.println("Toplam odenis= " + Phone.getSum(Phone.cart) + "$");


    }

}

