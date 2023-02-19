package Gun04;

public class _02_TipDonusumleri {

    public static void main(String[] args) {
        byte ornNot1=85;
        byte ornNot2=90;
        byte ornNot3=80;
        byte ornNot4=95;

        int toplam=ornNot1;// byte -> int atınca problem çıkarmadı  (GENİŞLETME - Widening Casting)
        // çünkü byte için hafızada ayrılan , zaten int e sığar , sığdığı için kabul ederim.
        // çünkü veri kaybı olma ihtimali hiç yok.

        ornNot1= (byte) toplam;// int -> byte atınca dur bakalım dedi   (DARALTMA -- Narrow Casting)
        // büyük hafıza ayrılmış bir alanı, küçük hafıza ayrılmış alana atma işlemi var.
        // veri kaybı ihtimali var mı



    }
}
