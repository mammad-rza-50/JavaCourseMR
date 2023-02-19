package Gun20;

public class _05_JavaMethod {
    public static void main(String[] args) {

        int s1 = 4;
        int s2 = 12;
        int s3 = 34;

        int sonuc1 = toplamBul1(s1, s2);
        int sonuc2 = toplamBul2(s1, s2, s3);

        String ad = "Memmed";
        String soyad = "Rzayev";
        String sonuc3 = adSoyadYaz(ad, soyad);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }

    public static int toplamBul1(int s1, int s2) {
        return s1 + s2;
    }

    public static int toplamBul2(int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public static String adSoyadYaz(String ad, String soyad) {
        return ad + " " + soyad;

    }
}
