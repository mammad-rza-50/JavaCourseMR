package Gun46;

public class foreachDiziTable {
    public static void main(String[] args) {

        // 1D--Arraylar

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};

        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2 = new int[3];
        array2[0] = 7;
        array2[1] = 12;
        array2[2] = 14;

        System.out.print(" array.length = " + array.length);
        System.out.print(" array1.length = " + array1.length);
        System.out.print(" array2.length = " + array2.length);
        System.out.println();

        // index sirasi ile getdiyine gore sira qaranti
        for (int i = 0; i < array2.length; i++) {         // array, array1 eyni qayda
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // sira qaranti deyil
        for (int arr : array) {             // array1, array2 eyni qaydada
            System.out.print(arr + " ");
        }


        // 2D arraylar
        int[][] table = new int[2][3];
        table[0][0] = 7;  // 1 satir
        table[0][1] = 25; // 1 satir
        table[0][2] = 14; // 1 satir
        table[1][0] = 12; // 2 satir
        table[1][1] = 80; // 2 satir
        table[1][2] = 43; // 2 satir

        int[][] table1 = {   //  eleman verildiyinde uzunlugu verilmir
                {1, 2, 3, 4, 5,},
                {6, 7, 8,}
        };

        int[][] table2 = new int[2][3];
        table2[0] = new int[]{2, 4, 6, 8, 10}; // her satiri yeniden teyin edirik [0] satir sayisi 5
        table2[1] = new int[]{2, 6, 10}; // her satiri yeniden teyin edirik [1] satir sayisi 3
        System.out.println("\ntable2.length = " + table2.length); // satirin sayini verir yeni 2
        System.out.println("table2[0].length = " + table2[0].length);// [0] satirin uzunlugu 5
        System.out.println("table2[1].length = " + table2[1].length);// [1] satirin uzunlugu 3

        for (int i = 0; i < table2.length; i++) {

            for (int j = 0; j < table2[i].length; j++) { // satirlarin uzunlugu yeni [0][1] satirlarin

                System.out.print(table2[i][j] + " ");
            }
            System.out.println();

        }

        for (int[] satir : table2) { // satirlari yazir

            for (int eleman : satir) {         // satirlarin elemanlarini yazir

                System.out.print(eleman + " ");
            }
            System.out.println();
        }

        for (int[] satir : table2) {

            for (int i = 0; i < satir.length; i++) {
                System.out.print(satir[i] + " ");
            }
            System.out.println();
        }

        int table3[][] = new int[2][3];  // belede yazila bilir
    }

    public static class _05_OCA_Exam_ {
        public static void main(String[] args) {


        }
    }
}
