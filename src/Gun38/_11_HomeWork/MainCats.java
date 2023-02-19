package Gun38._11_HomeWork;

import Gun38._11_HomeWork.HomeCats;
import Gun38._11_HomeWork.Lions;
import Gun38._11_HomeWork.Tigers;

public class MainCats {
    public static void main(String[] args) {


        Tigers tigers = new Tigers();
        tigers.talk();
        tigers.walk();

        Lions lions = new Lions();
        lions.talk();
        lions.walk();

        HomeCats homeCats = new HomeCats();
        homeCats.talk();
        homeCats.walk();

    }
}
