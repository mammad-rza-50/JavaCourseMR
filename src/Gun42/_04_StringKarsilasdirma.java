package Gun42;

public class _04_StringKarsilasdirma {
    public static void main(String[] args) {

        // Stringlerde niye == yerine equal istifade edilir

        String sentence1 = "Bugun hava gozel";
        String sentence2 = "Bugun hava gozel";

        if (sentence1 == sentence2)
            System.out.println("sentence1 sentence2 beraber"); // beraber
        else
            System.out.println("sentence1 sentence2 beraber deyil");

        if (sentence1.equals(sentence2))
            System.out.println("sentence1 sentence2 beraber"); // beraber
        else
            System.out.println("sentence1 sentence2 beraber deyil");


       /***************Reference Tiplerde nece olur**************/

        String sentence3 = new String("Bugun hava gozel");
        String sentence4 = new String("Bugun hava gozel");

        if (sentence3 == sentence4)
            System.out.println("sentence3 sentence4 beraber");
        else
            System.out.println("sentence3 sentence4 beraber deyil");//beraber deyil

        if (sentence3.equals(sentence4))
            System.out.println("sentence3 sentence4 beraber"); // beraber
        else
            System.out.println("sentence3 sentence4 beraber deyil");
    }


}
