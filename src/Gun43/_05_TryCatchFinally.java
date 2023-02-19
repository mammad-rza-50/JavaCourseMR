package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime = 0;
        String str = "";

        try {
            // xeta ola bilme sahe
            startTime = System.currentTimeMillis();
            System.out.println("Xetadan onceki hisse");
            char firstLetter = str.charAt(6);
            System.out.println("Xetadan sonraki hisse");
        } catch (Exception error) {
            // xeta olanda yazilan mesajlar
            System.out.println("catch bloku isledi");
        } finally // xeta olsada calisir, olmasada calisir olan hisse
        // bu hisse yuxaridaki surecle oldugunu gostermek ucun
        // finally icinde yazilir
        {
            long lastTime = System.currentTimeMillis() - startTime;
            System.out.println("Kecen vaxt= " + lastTime);
            System.out.println("Try-catch blokunda son edilenler");

        }
        System.out.println("Diger calisan kodlar");
        System.out.println("Proqramin sonu");
    }
}
