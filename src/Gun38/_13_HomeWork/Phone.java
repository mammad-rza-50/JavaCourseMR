package Gun38._13_HomeWork;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {

    public static List<String> cart = new ArrayList<>();

    public static int getSum(List<String> list) {

        int total = 0;
        for (String str : list) {
            int pay;
            pay = Integer.parseInt(str.replaceAll("\\$", ""));
            total += pay;
        }
        return total;
    }

    public abstract void options(String capasity, String screenSize);

}
