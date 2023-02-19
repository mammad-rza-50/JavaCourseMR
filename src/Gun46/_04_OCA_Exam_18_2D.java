package Gun46;

public class _04_OCA_Exam_18_2D {
    public static void main(String[] args) {

        String[][] chs = new String[5][2];  // 5 satir 2 sutun yani 2 eleman
        chs[0] = new String[4]; // eleman sayisi 4
        chs[1] = new String[5];  // eleman sayisi 5

        int i = 97;

        System.out.println("chs = " + chs.length);
        System.out.println("chs[0] = " + chs[0].length);
        System.out.println("chs[1] = " + chs[1].length);
        System.out.println("chs[2] = " + chs[2].length);
        System.out.println("chs[3] = " + chs[3].length);
        System.out.println("chs[4] = " + chs[4].length);

        for (int j = 0; j < chs.length; j++) {

            for (int k = 0; k < chs.length; k++) { //  chs.length  burada xeta verir
                chs[j][k] = "" + i;
                i++;
            }
        }
        for (String[] ca : chs) {

            for (String c : ca) {

                System.out.print(c + " "); // ArrayIndexOutOfBoundsException: 4
            }
            System.out.println();
        }

    }
}
