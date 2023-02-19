package Gun15;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {

        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++)

                System.out.print("*");
            System.out.println();

        }
        for (int i = 5; i > 0; i--) {

            for (int j = 1; j <= i; j++)

                System.out.print("*");

            System.out.println();
        }

    }

}


