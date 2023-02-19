package Gun15;

public class _03_JavaNestedLoop {
    public static void main(String[] args) {

// Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *        1.Satırda 1 yıldız
        // **       2.satırda 2 yıldız
        // ***      3.satırda 3 yıldız
        // ****     4.satırda 4 yıldız
        // *****    5.satırda 5 yıldız

        for (int i=1; i<=5; i++) {           // i=1;i=2;i=3;i=4;i=5;

            for ( int j = 1; j <= i; j++)
                System.out.print("*");      //  *;  j=1
                                            //  **;  j=2
            System.out.println();           //  ***;  j=3
        }                                   //  ****;  j=4
                                            //  *****;  j=5
    }}

