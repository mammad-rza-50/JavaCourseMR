package Gun13;

public class _13_HomeWorkAssignment5 {
    public static void main(String[] args) {

        //5- 100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.
        int i = 0;
        int sayi = 0;                                // 5,15,25,35,45,55,65,75,85,95;

        while (sayi <= 100) {

            if (sayi % 10 == 5)
            {

                i++;
            }
            sayi ++;
        }
            System.out.println("i = " + i);


    }
}
