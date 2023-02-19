package Gun33._02_Sample;

public class Snake extends Animal{
    private double lenght;

    public Snake(String color, int weight, String genus, double lenght) {
        super(color, weight, genus);
       setLenght(lenght);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Fsildadi");
    }
}
