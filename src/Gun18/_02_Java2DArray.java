package Gun18;

public class _02_Java2DArray {
    public static void main(String[] args) {

        int[] array = new int[10];     // bos default 0 olan

        int[][] tablo = new int[2][3];  // 2 satir(row), 3 sutun(column)
                                        // bos default 0  2*3 kadar 6 adet sayi

        int[][] tablo2 = {

                {1,2,3} ,   // 0 satir(row)
                {4,5,6}    // 1 satir(row)
                          };

        for (int satir = 0; satir < 2; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {

                System.out.print(tablo2[satir][sutun] + " ");
            }
            System.out.println();
        }


    }
}
