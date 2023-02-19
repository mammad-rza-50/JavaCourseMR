package Gun20;

import java.util.Arrays;

public class _10_JavaMethodHomeAssignment4 {
    public static void main(String[] args) {

//       4.    Adı  reverseWord olan bir method oluşturun
//              Bu methodun String olarak bir parametresi olmalıdır
//              Ve bu cümledeki kelimelerle tersine çevirmeli
//              Ters halini yazdırın.
//                   Örnek 1 :
//                      Dize: Java yazın
//                   dönüş şöyle olmalıdır:  yazın Java
        String sentence = "Men Javani oyrenirem";
        reverseWord(sentence);
    }

    public static void reverseWord(String sentence) {

        String[] bosluq1 = sentence.trim().split(" ");

        for (int i = bosluq1.length - 1; i >= 0; i--) {

            for (int j = 0; j < bosluq1[i].length(); j++) {

                System.out.print(bosluq1[i].charAt(j) );

            }
            System.out.print(" ");
        }
    }
}





