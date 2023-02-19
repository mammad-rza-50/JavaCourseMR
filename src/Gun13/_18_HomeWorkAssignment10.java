package Gun13;

import java.util.Scanner;

public class _18_HomeWorkAssignment10 {
    public static void main(String[] args) {

        //10- Girilen bir sayının tersi ile aynı olup olmadığını bulunuz. yani simetrik sayı mı?

        Scanner input = new Scanner(System.in); System.out.print("sayı giriniz: "); int sayi = input.nextInt(); int kontrol = sayi; int tersi = 0;
        while (sayi > 0){
            tersi *= 10; tersi += sayi % 10;
            sayi /= 10;
        }
        if (kontrol == tersi){
            System.out.println("sayı-> " + kontrol+ ", tersi-> " + tersi + "  sayı simetrik");
        }else {
            System.out.println("sayı-> " + kontrol + ", tersi-> " + tersi + "  sayı simetrik değil");
        }

       /* Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin= ");     // Sample: 12321
        int sayi = scan.nextInt();
        int tersSayi = 0;
        int kalan;

        while (sayi != 0) {
            kalan = sayi % 10;
            tersSayi = tersSayi * 10 + kalan;
            sayi /= 10;
        }
            System.out.println("tersSayi = " + tersSayi);
            if (sayi == tersSayi)
                System.out.println("Girilen sayi polidromdur");
            else
                System.out.println("Girilen sayi polidrom deyil"); */
       }
    }


