package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {

    // Özet: Temel fark:
    // 1- İlkel tipler sadece 1 değer saklarlar,
    // bu yüzden metodlara sadece değeri gider.
    // Eşitlendiğinde sadece değer aktarılır.
    // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri,
    // bu yüzden ilkel tip gibi davranırlar
    // 3- Referans tipler metoda gönderildiklerinde kendileri giderler.
    // Eşitlemelerde referanslar eşitlenir.

    public static void main(String[] args) {

        // Primitiv tip
        int number = 12;
        numberIncrease(number);
        System.out.println("number = " + number); // 12

        numberIncrease2(number);
        System.out.println("number2 = " + number);

        //Referans tipler
        int[] array = {7,12,14};
        arrayReset(array);
        System.out.println("array = " + Arrays.toString(array)); // 0,0,0

        // Object tipler
        String sentence = "Memmed";
        sentenceReset(sentence);
        System.out.println("sentence = " + sentence);

    }

    public static void numberIncrease(int number){ // bura sayi gelir yeni deyeri12
        //Primitiv deyerlerin deyeri gelir
        number++; // 13
        System.out.println("number++ = " + number);
    }

    public static void arrayReset(int[] array){ // referans deyerlerin ozu gelir
        // Referans tiplerde ozleri gelir
        array[0]=0; array[1]=0; array[2]=0;
    }

    public static void sentenceReset(String sentence){ //
        // deyeri gelir
        sentence="";

    }
    public static int numberIncrease2(int number){
        //primitiv tipler aktarilan deyerdir
        number+=1;
        System.out.println("number2+ = " + number);

        return number;
    }
}
