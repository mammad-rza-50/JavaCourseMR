package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {

        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul("Memmed", s1, s2);
        int sonuc2 = toplamBul("Rzayev", s1, s2, s3);
        int sonuc3 = toplamBul("Nureddin", s1, s2, s3, s4);
        //  parametrler eyni tip sadece miqdarlari ferqli
        // bu tip veziyyetler ucun asanliq yaradir

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);

        int result1 = toplamBul(s1, s2, s3);
        System.out.println(result1);

        int result2 = toplamBul(s1, s2, s3, s4);
        System.out.println(result2);
    }

    // ... ile elaqeli 2 qanun var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı
    // gelen sayi ne qeder olursa olsun hamisini alib array sekline metod yaradir
    public static int toplamBul(String name, int... sayilar) { // ne qeder olursa olsun array seklinde alir
        int toplam = 0;
        System.out.println("name = " + name );
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];

        }
        System.out.println(name + "-->" + toplam);
        return toplam;
    }

    public static int toplamBul( int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public static int toplamBul(int s1, int s2, int s3, int s4) {
        return s1 + s2 + s3 + s4;


    }

}
