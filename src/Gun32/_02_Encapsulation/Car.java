package Gun32._02_Encapsulation;

public class Car {

    private String color;
    private String model;
    private double engineVolume;
    private int doorsCount;

    public Car() {

    }

    public Car(String color, String model, double engineVolume, int doorsCount) { // constructor
        setColor(color);
        setModel(model);                    // bele olanda qorumali olur
        setEngineVolume(engineVolume);
        setDoorsCount(doorsCount);
//        this.color = color;              bele olanda birbasa gonderir deyerleri
//        this.model = model;
//        this.engineVolume = engineVolume;
//        this.doorsCount = doorsCount;
    }


    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDoorsCount(int doorsCount) {

        if (doorsCount <= 7)
            this.doorsCount = doorsCount;
        else
            System.out.println("kapi sayisi hatali");

    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", doorsCount=" + doorsCount +
                '}';
    }
}
