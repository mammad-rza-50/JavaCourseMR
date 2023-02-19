package Repeat_02.StaticAndNonStatic;

public class Student {
    //özellikleri
    String ad;
    String soyad;
    String tel;

    static int ogrSay = 0;// sen bitanesin

    public Student() {
        ogrSay++;
    }

    // davranis, metodu
    public void kimlikYazdir() {
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("tel = " + tel);
    }

    public static void ogrSayYazdir() {

    }
}
