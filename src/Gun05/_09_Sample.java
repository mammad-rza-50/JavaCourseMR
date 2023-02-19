package Gun05;

import java.util.Scanner;

public class _09_Sample {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)
        Scanner scan = new Scanner(System.in);
        double agirlik, boy,index;
        System.out.print("Agirligini gir: ");
        agirlik = scan.nextDouble();
        System.out.print("Boyunu gir: ");
        boy = scan.nextDouble();
        System.out.println("agirlik = " + agirlik);
        System.out.println("boy = " + boy);
        index = agirlik/(boy*boy);
        System.out.println("index = " + index);
    }
}
