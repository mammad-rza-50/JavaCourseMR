package Gun38._02_Abstract_Question;

public class Circle extends Picture {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimetre() {
        return Math.PI * radius*2;
    }
}
