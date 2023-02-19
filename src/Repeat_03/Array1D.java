package Repeat_03;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        // Array(Dizi)

        int sayi=5; // hafızada 1 tane sayı saklayabiliyor.

        // 10 tane öğrencinin not ortalaması bulup, geçenlerin sayısını bulmak istiyorum.
        int ogrNot1;
        int ogrNot2;
        int ogrNot3;
        //...
        //...
        //...
        int ogrNot10;
        /**************************************/

        int[] ogrNotlar=new int[10]; // 10 tane sayı saklama imkanı veriyor. //apartman

        // kutu numaralarını gösteren bu sayılara index denir.
        ogrNotlar[0]= 3;  // ogrNotlardan 1.kutu
        ogrNotlar[1]=34;  // ogrNotlardan 2.kutu
        ogrNotlar[2]= 5;  // ogrNotlardan 3.kutu
        ogrNotlar[3]= 2;
        //...
        //...
        //...
        ogrNotlar[9]=45; // en son index uzunluk-1 dir. uzunluk tanımlarken verdiğin rakam

        for(int i=0; i<ogrNotlar.length; i++)
        {
            System.out.println(ogrNotlar[i]); // i= 0,1,2,3,4,5,6,7,8,9  index
        }

        Scanner oku=new Scanner(System.in);
        for(int i=0; i<ogrNotlar.length;i++)
        {
            System.out.print("sayi giriniz=");
            ogrNotlar[i]=oku.nextInt();
        }

        for(int i=0; i<ogrNotlar.length;i++)
        {
            System.out.println( (i+1)+".Öğrencini Not=" + ogrNotlar[i]);
        }




    }
}
