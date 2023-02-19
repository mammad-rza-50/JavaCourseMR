package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = {
                {75, 42},
                {14, 25, 50},
                {80, 1, 85, 7, 90, 16},
                {20, 85, 96},
                {7}
        };
        System.out.println("Satir uzunlugu= " + tablo.length);
        System.out.println("0.Satir uzunlugu= " + tablo[0].length);
        System.out.println("1.Satir uzunlugu= " + tablo[1].length);
        System.out.println("2.Satir uzunlugu= " + tablo[2].length);
        System.out.println("3.Satir uzunlugu= " + tablo[3].length);
        System.out.println("4.Satir uzunlugu= " + tablo[4].length);

        // yazdirma hissesi

        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
