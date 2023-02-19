package Gun15;

public class HomeAssignmet5 {
    public static void main(String[] args) {

           /*   5-  **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.

                Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.

                Eğer sayı çift sayıysa;     **This number is even and number is 0**
                Eğer sayı tek sayıysa;      **This number is odd and number is 1**   ......yazdırmalıdır.

               `Sonuç böyle olmalıdır.`     This number is even and number is 0
                                            This number is odd and number is 1
                                            This number is even and number is 2
                                            This number is odd and number is 3       */

        for (int i = 0; i <=100; i++) {

            if (i % 2 == 0)

                System.out.println("This number is even and number is= " + i);

            else

                System.out.println("This number is odd and number is= " + i);
        }




    }
}
