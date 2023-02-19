package Gun38._12_HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);

        int number1, number2;

        System.out.print("Sayi1 i girin= ");
        number1 = scanInt.nextInt();
        System.out.print("Sayi2 i girin= ");
        number2 = scanInt.nextInt();

        Sum sum = new Sum();
        System.out.println("Topla= " + sum.calculating(number1, number2));

        Divide divide = new Divide();
        System.out.println("Bolme= " + divide.calculating(number1, number2));

        Multiply multiply = new Multiply();
        System.out.println("Vurma= " + multiply.calculating(number1, number2));

        Substract substract = new Substract();
        System.out.println("Cixma= " + substract.calculating(number1, number2));


    }
}
