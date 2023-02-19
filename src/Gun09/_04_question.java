package Gun09;

import java.util.Scanner;

public class _04_question {
    public static void main(String[] args) {
        // girilen bir sayinin tekmi ciftmi oldugunu yaxdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi girin: ");
        int sayi = scan.nextInt();
        if (sayi%2!=0)
            System.out.println("Girilen sayi tekdir");
        if (sayi%2==0)
            System.out.println("Girilen sayi cifdir");




    }
}
