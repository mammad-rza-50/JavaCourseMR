package Gun37._01_Question;

public class Bus extends Vehicle implements IDizel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDizel() {
        return ("500 km sonra dizel dolmali");

    }

    @Override
    public String drive() {
      return ("Direksiyon yagini 30.000 km deyismeli");

    }
}
