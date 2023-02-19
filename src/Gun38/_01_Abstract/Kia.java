package Gun38._01_Abstract;

public class Kia extends Vehicle{// implements IVehicle{ abstractda buna ehtiyyac yoxdur
    @Override
    public int speedTime() {
        return 0;
    }

    public Kia(String model, int year, int gearCount) {
        super(model, year, gearCount);
    }
}
