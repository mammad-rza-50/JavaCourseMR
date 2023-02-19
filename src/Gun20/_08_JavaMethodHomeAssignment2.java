package Gun20;

public class _08_JavaMethodHomeAssignment2 {
    public static void main(String[] args) {

//     2.   "OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//                Ortadaki kelimeyi return yapınız.
//         Örnek:
//                Ben Java'yı seviyorum.
//                                       print : Java'yı
//        Örnek2:
//                 Java'yı kolayca öğreniyorum.
//                                              print: kolayca

        OrtaKelime("Men Javani oyrenirem");

    }

    public static String OrtaKelime(String kelime) {

        int bosluq1 = kelime.indexOf(" ");
        int bosluq2 = kelime.lastIndexOf(" ");
        String kelimeOrta = kelime.substring(bosluq1 + 1, bosluq2);
        System.out.println("kelimeOrta = " + kelimeOrta);
        return kelimeOrta;
    }


}
