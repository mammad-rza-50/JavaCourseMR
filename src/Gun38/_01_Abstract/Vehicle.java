package Gun38._01_Abstract;

// 2 si bira arda  >> 1 interface+ 1 parent class = abstract class

public abstract class Vehicle  {
    private String model;
    private int year;
    private int gearCount;

    public Vehicle(String model, int year, int gearCount) {
        setModel(model);
        setYear(year);
        setGearCount(gearCount);
    }
    abstract int speedTime(); // bu Interface dir yani 2 si birinde

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

}
