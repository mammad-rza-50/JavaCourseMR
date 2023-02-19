package Gun13;

public class _05_WhileLoop {
    public static void main(String[] args) {

        // 100 e kadar olan sayilarin toplamini bulunuz
        int sayi = 0;
        int toplam = 0;

        while (sayi <= 100)
        {
            toplam += sayi;
            sayi++;
        }

        System.out.println("toplam = " + toplam);

    }
}
