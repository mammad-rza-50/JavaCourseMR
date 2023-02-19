package Gun23;

import java.util.HashSet;

public class
_04_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hsInt = new HashSet<>();
        hsInt.add(1);
        hsInt.add(12);
        hsInt.add(42);
        hsInt.add(20);
        hsInt.add(14);
        hsInt.add(25);
        hsInt.add(50);

        System.out.println("hsInt.size = " + hsInt.size());

        hsInt.remove(20); // elementin oz deyerini silir
        System.out.println("hsInt 20 elementi silir = " + hsInt);

        if (hsInt.contains(25))
            System.out.println("hsInt.contains = " + "var");
        else
            System.out.println("hsInt.contains = " + "yok");


      //  hsInt.clear();
      //  System.out.println("hsInt.clear = " + hsInt);

        hsInt.spliterator();
        System.out.println("hsInt.spliterator = " + hsInt);

        System.out.println("hsInt.hashCode()= "+hsInt.hashCode());


    }
}
