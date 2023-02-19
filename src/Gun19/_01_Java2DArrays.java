package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo =
                {
                {42, 7, 12},
                {25, 20, 14}
                };

        System.out.println("Satir uzunlugu= " + tablo.length);  // 2 satir sayisi
        System.out.println("0.Satir uzunlugu= " + tablo[0].length);  // 0 satirin 3 sutun uzunlugu
        System.out.println("1.Satir uzunlugu= " + tablo[1].length);  // 1 satirin 3 sutun uzunlugu

        for (int i = 0; i < tablo.length; i++) {   // satir sayis

            // ilgili satirin sutun uzunlugu
            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
