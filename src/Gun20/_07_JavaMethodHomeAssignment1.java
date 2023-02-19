package Gun20;

public class _07_JavaMethodHomeAssignment1 {
    public static void main(String[] args) {


//  1.     Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//        Random numarayı döndürünüz.

        randomNum(100);

    }

    public static void randomNum(int max) {

        int randomSayi = (int) (Math.random() * max);
        System.out.println("randomSayi = " + randomSayi);
    }
}
