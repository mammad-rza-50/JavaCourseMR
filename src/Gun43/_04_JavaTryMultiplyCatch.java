package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultiplyCatch {
    public static void main(String[] args) {

        System.out.println("Proqram basladi");

        try {

            Scanner scan = new Scanner(System.in);

            System.out.print("Sayi1= ");
            int number1 = scan.nextInt();

            System.out.print("Sayi2= ");
            int number2 = scan.nextInt();

            int divide = number1 / number2;
            System.out.println("divide = " + divide);

            String sentence = ""; // umumi xeta olsun deye yazildi
            sentence.charAt(3);

        } catch (InputMismatchException error) {

            System.out.println("Zehmet olmasa reqem daxil edin");
        } catch (ArithmeticException error) {
            System.out.println("Sifira bolme xetasi");
        } catch (Exception error) // yuxaridaki xetalardan basqa xetalar ucun
        {
            System.out.println("Xeta oldu= " + error.getMessage());
        }
        System.out.println("Proqram bitti");
    }
}
