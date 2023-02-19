package Gun09;

import java.util.Scanner;

public class _06_question {
    public static void main(String[] args) {
        // girilen bir cumlede a harfinin kecib kecmediyini
        // bulunuz , kecirse EVET kecmirse HAYIR yazdiriniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle giriniz: ");
        String cumle = scan.nextLine();

      if(cumle.contains("a"))
        System.out.println("Evet" );
      if(!cumle.contains("a"))         // !değilse  if ( cumle.contains("a")==false )
          System.out.println("HAYIR");
      // 2 yol
        if (cumle.indexOf("a")!=-1 )      // var ise index indexini verir

            System.out.println("Evet" );

        if (cumle.indexOf("a")==-1 )
            System.out.println("HAYIR" );

        // 3 yol

        boolean aHarfVarmi = cumle.contains("a");

        if (aHarfVarmi)
            System.out.println("Evet");
        if (!aHarfVarmi)
            System.out.println("Hayir");





    }
}


