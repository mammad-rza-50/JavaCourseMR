package Gun38._03_Abstract_Question;

public class Main {
    public static void main(String[] args) {

        Paxlava paxlava = new Paxlava();
        paxlava.setName("Seki paxlavasi");
        paxlava.taste();
        paxlava.madeIn();


        CheeseCake cheeseCake = new CheeseCake();
        cheeseCake.setName("Pendirli tort");
        cheeseCake.taste();
        cheeseCake.madeIn();


        GreekSalad greekSalad = new GreekSalad();
        greekSalad.setName("Pazi saladi");
        greekSalad.taste();
        greekSalad.madeIn();


        SezarSalad sezarSalad = new SezarSalad();
        sezarSalad.setName("Coban saladi");
        sezarSalad.taste();
        sezarSalad.madeIn();

    }
}
