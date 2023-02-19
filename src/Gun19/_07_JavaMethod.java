package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
  public static void main(String[] args) {

        isEvenIsOdd(12);
        isEvenIsOdd(25);

        isEvenIsOddScan();
    }

  public static void isEvenIsOdd(int number){
        if (number % 2 ==0 )

            System.out.println("Is Even");
        else
            System.out.println("is Odd");
    }

    public static void isEvenIsOddScan(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number= ");
        int number = scan.nextInt();
        isEvenIsOdd(number);
    }
}
