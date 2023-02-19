package Gun08;

import java.util.Scanner;

public class _09_question {
    public static void main(String[] args) {
        // girilen bir cumledeki ilk kelimeni tapin

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle girin: ");
        String cumle = scan.nextLine();
        int ilkKelimeSonIndex = cumle.indexOf(" ");
        String ilkKelime = cumle.substring(0, ilkKelimeSonIndex);
        System.out.println("ilkKelime = " + ilkKelime);







    }
}
