package Gun21;

public class _06_JavaArrayHomeAssignment2 {
    public static void main(String[] args) {

//    2.    Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
//           2D array'de olan elemanları toplayınız.
//            toplamı yazdırınız.
//             Sonuç 32 olmalıdır.
        int[][] arrays = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int total = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {

                total += arrays[i][j];

            }
        }
        System.out.println("Total = " + total);
    }
}
