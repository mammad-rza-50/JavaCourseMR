package Gun04;

public class _01_BoolleanType {
    public static void main(String[] args) {

        // sadece 2 degeri yani true veya false olabilen değişkenler için kullanılıyor.
        // baklava diliminde sorulan sorunun cevabı gibi

        // çünkü byte için hafızada ayrılan , zaten int e sığar , sığdığı için kabul ederim.
        // çünkü veri kaybı olma ihtimali hiç yok.
        byte ogrNot1=98;
        byte ogrNot2=98;
        byte ogrNot3=100;
        byte ogrNot4=98;
        int toplam=ogrNot1; // byte -> int atınca problem çıkarmadı  (GENİŞLETME - Widening Casting)
        // çünkü byte için hafızada ayrılan , zaten int e sığar , sığdığı için kabul ederim.
        // çünkü veri kaybı olma ihtimali hiç yok.



        ogrNot1 = (byte)toplam;  // int -> byte atınca dur bakalım dedi   (DARALTMA -- Narrow Casting)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma işlemi var.
        // veri kaybı ihtimali var mı





        boolean BeContinue=false;
        System.out.println("BeContinue = " + BeContinue);
    }
}
