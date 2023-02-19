package Gun37._01_Question;

public class TeslaCar extends Vehicle implements IElectric {
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBaterry() {

      return ("Batarya 100.000 milden sonra deyismeli!!!");

    }

    @Override
    public String drive() {
        return ("Auto pilotu var.");

    }
}
