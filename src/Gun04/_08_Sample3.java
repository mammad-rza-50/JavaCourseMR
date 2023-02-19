package Gun04;

public class _08_Sample3 {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.



        String bagis1="120";
        String bagis2="140";

        int BagisPara1=Integer.parseInt(bagis1);
        int BagisPara2=Integer.parseInt(bagis2);

        int Toplam= BagisPara1+BagisPara2;
        System.out.println("Toplam = " + Toplam);

        String strToplam= Integer.toString(Toplam);
        System.out.println("strToplam = " + strToplam);
    }
}
