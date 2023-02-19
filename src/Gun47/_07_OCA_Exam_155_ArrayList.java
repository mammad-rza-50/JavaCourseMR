package Gun47;

import java.util.ArrayList;

public class _07_OCA_Exam_155_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2); //points.remove(1); silir
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1); // 1-ci indexi silir yeni 2-ni silir
        points.remove(null);
        System.out.println(points); // [1, 3, 4]
        //points.remove((Object)1); olanda deyer olaraq 1-i silir
        // 1 den cox null varsa birinci nullu silir
    }
}
