package Gun15;

public class HomeAssignmet3 {
    public static void main(String[] args) {

      /*    3   - #100 'den 0' a kadar bütün tek sayıları yazdırınız.
         ```
        99 - 98 - 97 - 96....
          ```
         `100 ve 0 dahil değildir.`   */


        for (int i = 100; i >0 ; i--) {

            if (i % 2 != 0)
                System.out.println("Tek sayi= " + i);

        }


    }
}
