package Gun15;

public class HomeAssignmet7 {
    public static void main(String[] args) {

      /*  7- #  Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
                  Ornek:   _length(uzunluk): 7_
                           _width(genişlik): 5_
                                                 _Output:_
                                                           #####
                                                           #####
                                                           #####
                                                           #####
                                                           #####
                                                           #####
                                                           #####             */

         int length = 14; int width = 12;

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {

                System.out.print("#");

            }
            System.out.println();
        }


    }
}
