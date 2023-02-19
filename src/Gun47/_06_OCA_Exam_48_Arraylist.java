package Gun47;

import java.util.ArrayList;
import java.util.List;

public class _06_OCA_Exam_48_Arraylist {
    public static void main(String[] args) {

        List colors = new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);//"red" silindi
        colors.add(3, "cyan");
        System.out.print(colors); //[green, blue, yellow, cyan]

    }
}
