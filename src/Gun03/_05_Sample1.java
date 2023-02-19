package Gun03;

public class _05_Sample1 {
    public static void main(String[] args) {
        //  İki kenarı tanımlı olarak verilen bir
        //  dikdortgenin çevresini ve alanını bulunuz
        //  çarpma :   * kullanılıyor ,   x ise harf olarak kullanılıyor
        //  bir kenarı a ise , diğer kenarı b ise, cevre=a+a+b+b, alan =a*b



        int a=12; int b=14;
        int cevre=(a+b)*2;
        int alan=a*b;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
