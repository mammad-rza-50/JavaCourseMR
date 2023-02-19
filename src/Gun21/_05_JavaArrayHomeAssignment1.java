package Gun21;

public class _05_JavaArrayHomeAssignment1 {
    public static void main(String[] args) {

//     1   Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
//        Bütün 2'leri 6'yla değiştirin.
//        Array'i yazdırınız.

        int[][] arrays = {{2, 7, 2}, {11, 12, 14}, {20, 2, 25}};

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {

                if (arrays[i][j] == 2) {
                    arrays[i][j] = 6;
                }
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
