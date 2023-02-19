package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> mathNots = new ArrayList<>();
        ArrayList<Integer> physicsNots = new ArrayList<>();
        ArrayList<Integer> chemicalNots = new ArrayList<>();

        mathNots.add(50);
        mathNots.add(70);
        mathNots.add(90);

        physicsNots.add(40);
        physicsNots.add(60);

        chemicalNots.add(85);
        chemicalNots.add(80);
        chemicalNots.add(95);
        chemicalNots.add(75);

        ArrayList<ArrayList<Integer>> notsList = new ArrayList<>();
        notsList.add(mathNots);
        notsList.add(physicsNots);
        notsList.add(chemicalNots);

        notsList.get(0);  // --> mathNots
        int mathNot = notsList.get(0).get(0);  // mathNots 0 elemani
        System.out.println("mathNot = " + mathNot);
        System.out.println("notsList.get(0) = " + notsList.get(0));
        System.out.println("notsList.get(1) = " + notsList.get(1));
        System.out.println("notsList.get(2) = " + notsList.get(2));

        for (int i = 0; i < notsList.size(); i++) {

            System.out.println("notsList.get(i) = " + notsList.get(i));
        }
        // satir sutun yazdirmaq

        for (int i = 0; i < notsList.size(); i++) {
            for (int j = 0; j < notsList.get(i).size(); j++) {
                System.out.print(notsList.get(i).get(j) + "\t");

            }
            System.out.println();
        }

    }
}
