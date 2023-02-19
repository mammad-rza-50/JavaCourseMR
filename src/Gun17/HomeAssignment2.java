package Gun17;

import java.util.Arrays;

public class HomeAssignment2 {
    public static void main(String[] args) {

//        Bir String oluşturun : "Hello World"
//
//        Stringi tersten yazdırın ve print edin.
//
//        _Cevap böyle olmalı : "dlroW olleH"_


        String sentence = "Hello World";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }


        // Array ile çözüm -> [d, l, r, o, W,  , o, l, l, e, H]

        char[] c = new char[sentence.length()];

        for (int i = 0; i < c.length; i++) {

            c[i] += sentence.charAt((c.length - 1) - i);
        }
        System.out.println(Arrays.toString(c));

    }
}
