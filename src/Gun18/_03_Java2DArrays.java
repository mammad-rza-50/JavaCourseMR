package Gun18;

public class _03_Java2DArrays {
    public static void main(String[] args) {

        // 2 ye 3 lük bir tabloyu random 100 e kadar sayılarla doldurunuz
        // sonrasında yazdırınız ve kaç tane tek sayı olduğunu bulunuz


        int[][] tablo = new int[2][3];

        int tekSayi=0;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                tablo[i][j] = (int) (Math.random() * 100);

                System.out.print(tablo[i][j]+" ");

                if (tablo[i][j] %2 !=0)

                    tekSayi++;

            }
            System.out.println();
        }
        System.out.println("tekSayi = " + tekSayi);
    }
}
