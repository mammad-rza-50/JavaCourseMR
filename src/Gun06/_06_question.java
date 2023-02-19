package Gun06;

import java.util.Scanner;

public class _06_question {
    public static void main(String[] args) {

        // Girilen bir ad soyadı örneğin "Ismet Temur" I.T.  şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);


        //Girilen bir ad soyadi "Rzayev Memmed"
        // R.M seklinde yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Adiniz Soyadiniz= ");
        String FullName = scan.nextLine();
        System.out.print(FullName.charAt(0) + ".");
        int bosluqIndex=FullName.indexOf(" ");
        System.out.println(FullName.charAt(bosluqIndex+1)+".");
    }
}
