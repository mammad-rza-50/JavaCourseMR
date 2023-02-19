package Gun39._05_OOP_Question;

import MyFunction.MyFunction;

import java.util.Timer;
import java.util.TimerTask;

public class AdanaKebab implements IFood{

    void marinade() {
        System.out.println("Marine edildi");
    }

    void grill() {
        System.out.println("Izgarada pisirildi");

    }


    @Override
    public void taste() {
        System.out.println("Enfes Adana Afiyet olsun");

    }

    @Override
    public double fee() {
        return 5;
    }
}
