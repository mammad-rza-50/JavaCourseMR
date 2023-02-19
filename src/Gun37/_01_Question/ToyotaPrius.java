package Gun37._01_Question;

public class ToyotaPrius extends Vehicle implements IElectric,IGaz{
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBaterry() {

        return  ("Bataryalara 10.000 milden sonra bakim gerekli");

    }

    @Override
    public String drive() {
        return ("Direksiyonu elektrikrikdir");

    }

    @Override
    public String changeOil() {
        return ("500 milden sonra benzin dolmali");

    }
}
