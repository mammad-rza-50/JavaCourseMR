package Gun09;

import java.util.Scanner;

public class _07_question {
    public static void main(String[] args) {
        // girilen bir cumledeki kucuk ve ya boyuk a harfini
        // olub olmadigini yazdirin VAR ve ya YOK

Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle giriniz: ");
        String cumle = scan.nextLine();
          cumle=cumle.toLowerCase();

        if(cumle.contains("a"))
            System.out.println("Evet" );
        if(!cumle.contains("a"))
            System.out.println("HAYIR");
        // 2 yol
        if (cumle.indexOf("a")!=-1 )
            System.out.println("Evet" );

        if (cumle.indexOf("a")==-1 )
            System.out.println("HAYIR" );






    }
}
