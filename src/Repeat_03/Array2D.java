package Repeat_03;

public class Array2D {
    public static void main(String[] args) {

        // 3 ayrı dersin ayrı ayrı notları dizi içinde
        int[] ders1Notlari=new int[10];  // 10 tane not saklıyor
        int[] ders2Notlari=new int[10];  // 10 tane not saklıyor
        int[] ders3Notlari=new int[10];  // 10 tane not saklıyor

        // 3 ayrı dersin notları tek bir değişkenin içinde
        int[][] tumDersNotlari=new int[3][10]; // 3x10 tane saklıyor

        for (int ders = 0; ders < 3; ders++) {  // 0,1,2

            for (int not = 0; not < 10; not++) {  // 0 -> 0-9 , 1-> 0-9, 2-> 0-9

                tumDersNotlari[ders][not]= (int)(Math.random()*100);
                //System.out.println(ders+" - " +not);
            }

        }


        for (int ders = 0; ders < 3; ders++) {  // 0,1,2

            for (int not = 0; not < 10; not++) {  // 0 -> 0-9 , 1-> 0-9, 2-> 0-9

                System.out.println((ders+1)+".Dersin "+(not+1)+".Notu="+ tumDersNotlari[ders][not]);
            }

        }


    }
}
