package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin= " );
        int sayi = scan.nextInt();
        System.out.println("(sayi>0 = " + ((sayi>0)? "pozitiv":(sayi <0)?"neqativ": "sifir"));
        
    }
}
