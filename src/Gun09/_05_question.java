package Gun09;

import java.util.Scanner;

public class _05_question {
    public static void main(String[] args) {
        // Girilen bir oyrencinin notuna gore 50 den boyuk -esit
        // ise gecdiniz kucuk ise kaldiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Notu giriniz: ");
        int not = scan.nextInt();
         if(not>=50)
             System.out.println("Tebrikler kecdiniz");
         if (not<50)
             System.out.println("Maalasef kaldiniz");

    }
}
