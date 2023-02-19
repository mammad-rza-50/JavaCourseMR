package Gun15;

public class HomeAssignmet8 {
    public static void main(String[] args) {

   /*     8-  # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._

        Sonuç böyle olmalıdır.

        *
      * *
    * * *
  * * * *
* * * * *                    */


        for (int i = 1; i <=5 ; i++) {

            for (int j = 0; j < 5-i ; j++) {

                System.out.print("  ");
            }
            for (int k = 0; k <i; k++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
