package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        int sayi=7;
        long toplam=7700;
        double nisbet=12.14;

        nisbet=sayi;
        System.out.println("nisbet = " + nisbet);

        toplam=sayi;
        System.out.println("toplam = " + toplam);

        nisbet=toplam;
        System.out.println("nisbet = " + nisbet);



    }


}
