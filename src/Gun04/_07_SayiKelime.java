package Gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // şu ana kadar, sayilari birbirine çevirdik
        // yazıların rakamlara çevrilmesi, rakamların yazıya çevrilmesi var


        String name="Memmed";
        String kelimeSayi="65";             // string halde , toplama gibi bir işleme giremez


        int sayiDeyer=Integer.parseInt(kelimeSayi);   // sayiya dönüşür

        int toplam= sayiDeyer+sayiDeyer;
        System.out.println("toplam = " + toplam);
        // toplam şu anda int yani sayi , bunu String nasıl dönüştürüm

        String strToplam=Integer.toString(toplam);     // String e dönüştürür

        System.out.println("strToplam = " + strToplam);

    }
}
