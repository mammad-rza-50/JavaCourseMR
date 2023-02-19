package Gun35._01_Final.method;

public class Car2 {
    private String model;

    public Car2(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "Car2{" +
                "model='" + model + '\'' +
                '}';
    }
}
