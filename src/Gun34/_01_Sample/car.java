package Gun34._01_Sample;

public class car { // super class
    private String color;
    private double engineVolume;
    private String brand;


    public car(String color, double engineVolume, String brand) {
        setColor(color);
        setEngineVolume(engineVolume);
        setBrand(brand);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


}
