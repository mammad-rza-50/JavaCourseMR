package Gun39._05_OOP_Question;

import MyFunction.MyFunction;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class TechnoKitchen {


    public static void prepare(IFood food) {

        System.out.println(food.getClass().getSimpleName() +
                " Sifarisi alindi");
        System.out.println("Tarix/Saat = " + LocalDateTime.now());
        System.out.println("*******Hazirlanmaya Basladi*******"); // bunlar hemise basda yazilir
       MyFunction.wait(2);
        if (food instanceof AdanaKebab) {
            ((AdanaKebab) food).marinade();
            ((AdanaKebab) food).grill();
            MyFunction.wait(2);
        } else if (food instanceof Lahmacun) {
            ((Lahmacun) food).dough();
            ((Lahmacun) food).addMeat();
            ((Lahmacun) food).bake();
            MyFunction.wait(2);
        } else if (food instanceof Borsh) {
            ((Borsh) food).boil();
            ((Borsh) food).eatTomorrow();
            MyFunction.wait(2);
        } else if (food instanceof Pilov) {
            ((Pilov) food).fry();
            ((Pilov) food).boil();
            MyFunction.wait(2);
        }
        System.out.println("Sifarisiniz hazirlandi: " + LocalDateTime.now()); // bunlar hemise axirda yazilir
        food.taste(); // optimal yolu budur
        System.out.println("============================================");
    }
}



