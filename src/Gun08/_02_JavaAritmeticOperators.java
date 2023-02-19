package Gun08;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {

        int sayac = 0;

        sayac = sayac + 1;
        sayac++; // once emeliyyat sonra artir. //eyni neticeni verir.
        ++sayac; // once artir sonra emeliyyat //eyni neticeni verir.
        System.out.println("sayac = " + sayac);

        sayac = sayac - 1;
        sayac--;
        --sayac;  //eyni neticeni verir.

        System.out.println("sayac = " + sayac);

        /************************************************************/

        int toplam = 5 + sayac;

        toplam = 5 + sayac++;   // toplam=5+sayac sonra sayac=sayac+1. netice=5;

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

        toplam = 5 + ++sayac; // sayac=sayac+1 sonra toplam=5+ sayac. netice=7;
        System.out.println("sayac = " + sayac);
        System.out.println("toplam = " + toplam);


        // Özet:  ++ lar sağda ise önce işlem sonra artış
        //        ++ lar solda ise önce artış sonra işlem.


    }
}
