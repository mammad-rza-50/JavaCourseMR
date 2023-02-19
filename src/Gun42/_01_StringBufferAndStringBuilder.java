package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String sentence1 = "";  // + isaresi stringlerde birlesme isi gorur
        sentence1 = sentence1 + "Bugun ";
        sentence1 = sentence1 + "hava ";
        sentence1 += "soyuqdur.";

        System.out.println("sentence1 = " + sentence1);
        System.out.println("sentence1 = " + sentence1.concat(" amma dunen isti idi"));
        System.out.println("sentence1 = " + sentence1);// concat ancaq birlesdirir amma teyin etmir

        sentence1 = sentence1.concat(" Amma dunen istidi idid");//
        System.out.println("sentence1 = " + sentence1);
        /**************************************************************************/
        StringBuilder sentence2 = new StringBuilder();
        sentence2.append("Hello");// append : elave edir, teyin etmekye ehtiyyac yoxdur ozu teyin edir
        sentence2.append(" Java");
        System.out.println("sentence2 = " + sentence2);
        /*************************************************************************/

          long startTime = System.currentTimeMillis();

//        String sentence3 = "";
//        for (int i = 0; i < 100000; i++)
//            sentence3 += "Hello";
//        System.out.println("String + vaxti= " + (System.currentTimeMillis() - startTime));
//
//        /*****************************************************************************/
//
//        startTime = System.currentTimeMillis();
//        String sentence4 = "";
//        for (int i = 0; i < 100000; i++)
//            sentence4 = sentence4.concat("Hello");
//        System.out.println("Concatin vaxti= " + (System.currentTimeMillis() - startTime));

/***************************************************************************/

        startTime = System.currentTimeMillis();
        StringBuilder sentence5 = new StringBuilder();
        for (int i = 0; i < 100000; i++)
            sentence5.append("Hello");
        System.out.println("StringBuilderin vaxti=" + (System.currentTimeMillis() - startTime));

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        /***********************************************************************************/

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bugun");
        stringBuilder.append(" hava");
        stringBuilder.append(" gozel");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        stringBuilder.append(7); // elave edilen her seyi toString hali varsa cevirerek elave edir
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.reverse(); // stringi tersine cevirir
        System.out.println("reverse = " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("reverse = " + stringBuilder);

        stringBuilder.delete(0,7); // (index) 0 daxil 7 xaric olaraq siler
        System.out.println("delete = " + stringBuilder);

        stringBuilder.deleteCharAt(7); // sadece verilen indexdeki chari siler
        System.out.println("deletechart = " + stringBuilder);

        stringBuilder.insert(0,"Indi"); //  0 indexe kelime ealve et
        System.out.println("insert = " + stringBuilder);

        stringBuilder = new StringBuilder("InseAllah sabah hava gozel olacaq");
        // sifiladi ve teze deyer teyin etdi
        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.replace(21,26,"isti");
        System.out.println("stringBuilder = " + stringBuilder);
        /*********************************************************************************/

        String string = stringBuilder.toString();


        StringBuffer stringBuffer = new StringBuffer();// StringBuilde ile tamamen eyni
          // ferqi paralel calisan yazilimlarda StringBuffer istifade olunur


    }
}