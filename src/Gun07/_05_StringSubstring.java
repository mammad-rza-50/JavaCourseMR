package Gun07;

public class _05_StringSubstring {
    public static void main(String[] args) {

        // stringin belli bir bölümünü alma işlemini yapar.

        //           012345678901234567


        String s1 = "Salam yoldaslar";

        String Parca1 = s1.substring(2,5);
        System.out.println("Parca1 = " + Parca1);

         String parca2 = s1.substring(9,12);
        System.out.println("parca2 = " + parca2);

        String parca3 = s1.substring(7);
        System.out.println("parca3 = " + parca3);


    }
}
