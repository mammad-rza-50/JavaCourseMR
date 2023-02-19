package Gun33._02_Sample;

public class Duck extends Animal{

    public double wingSpan;


    public Duck(String color, int weight, String genus, double wingSpan) {
        super(color, weight, genus);
        setWingSpan(wingSpan);
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Duck dusk");
    }
}
