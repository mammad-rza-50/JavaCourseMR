package Gun20;

public class _01_JavaMethod {
    public static void main(String[] args) {

        System.out.println("Salam Memmed");

        salamYaz();       // geden yok, gelen yok
        tolamYaz(10, 20);  // giden var, gelen yok
        int enb = Math.max(12, 25);  // geden var , gelen var
        System.out.println("enb= " + enb);
        double sayi = Math.random();  // geden yok, gelen var
        System.out.println("double sayi= " + sayi);

        enBoyukYaz(80, 85);
        int donecek = enBoyukBul(12, 14);
        System.out.println("donecek = " + donecek);

    }

    public static int enBoyukBul(int a, int b) {

        int donecek = 0;
        if (a > b) {
            donecek = a;
        } else {
            donecek = b;
        }
        // System.out.println("donecek = " + donecek);
        return donecek;
    }

    public static void enBoyukYaz(int a, int b) {

        if (a > b)
            System.out.println("enBoyukYaz= :" + a);
        else
            System.out.println("enBoyukYaz= " + b);
    }

    public static void tolamYaz(int a, int b) {

        System.out.println("toplam yaz= " + (a + b));
    }

    public static void salamYaz() {
        System.out.println("Salam Java");
    }
}
