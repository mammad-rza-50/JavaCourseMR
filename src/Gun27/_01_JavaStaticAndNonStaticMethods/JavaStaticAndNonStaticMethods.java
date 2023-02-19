package Gun27._01_JavaStaticAndNonStaticMethods;

public class JavaStaticAndNonStaticMethods {
    public static void main(String[] args) {

        // STATIC olan metdolar SINIF a yani CLASS yani
        // TİP e ait
        // STATIC olmayanlar kime ait nesneye ait bu sebeple
        // mutlaka oluşturulmaları gerekiyor

        // Nesneyi ilgilendiren metdoları normal yazıyoruz.
        // Nesneyi ilgilendirmeyen, Tipi ilgilendiren
        // metodları STATIC ile yazıyoruz.


        int number = 365;
        String strNumber = String.valueOf(number);

        int intNumber = Integer.parseInt(strNumber);

        Utility utlty = new Utility();

        String str1 = utlty.getString(number);

        String strNumber2 = Utility.getString2(number);

        // Static metodlatlar zaten var olduklari ucucn
        // new ile yeni olusdurmaya ehtiyac yoxdur

        String strNumber3 = Utility.getString2(number);

    }
}
