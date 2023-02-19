package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException
{
    public static void main(String[] args)
    {

        System.out.println("Proqram basladi");

        try {

            Scanner scan = new Scanner(System.in);

            System.out.print("Sayi1= ");
            int number1 = scan.nextInt();

            System.out.print("Sayi2= ");
            int number2 = scan.nextInt();

            int divide = number1 / number2;
            System.out.println("divide = " + divide);

        } catch (Exception error)
        // xeta mesajlarini hata adli Exception cinsinden deyisken atin
        {
            System.out.println("Error= " + error.getMessage());
            System.out.println("Zehmet olmasa tekrar yoxlayin");
        }
        System.out.println("Proqram bitti");
    }
}