package Gun05;

import java.util.Scanner;

public class _02_Sample {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.next();     // next() bir kelime okur.

        System.out.println("name = " + name);
  /*
          okuyucu.next();     -> bir kelime okur
          okuyucu.nextLine(); -> satırın tümünü oku

          okuyucu.nextInt();  -> int değeri okumak için
          okuyucu.nextShort();  -> short değeri okuma için
          okuyucu.nextByte();   -> byte değeri okumak için
          okuyucu.nextLong();   -> long değeri okuma için

          okuyucu.nextFloat();  -> float değeri okuma için
          okuyucu.nextDouble(); -> doublem değeri okuma için

          okuyucu.nextBoolean();-> true veya false girişi için
        */

    }
}
