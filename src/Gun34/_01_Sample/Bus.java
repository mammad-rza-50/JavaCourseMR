package Gun34._01_Sample;

public class Bus extends car {

    private int passengerCapasity;


    public Bus(String color, double engineVolume, String brand, int passengerCapasity) {
        super(color, engineVolume, brand);
        setPassengerCapasity(passengerCapasity);

    }

    public int getPassengerCapasity() {
        return passengerCapasity;
    }

    public void setPassengerCapasity(int passengerCapasity) {
        this.passengerCapasity = passengerCapasity;
    }

    @Override
    public String toString() {
        return "Bus{ " +
                "'Color=" + getColor() + '\'' +
                " 'Engine Volume=" + getEngineVolume() + '\'' +
                " 'Brand=" + getBrand() + '\'' +
                " 'passengerCapasity=" + getPassengerCapasity() +
                "' } ";
    }
}
