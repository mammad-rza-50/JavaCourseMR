package Gun38._02_Abstract_Question;

public class Rectangle extends Picture {

    private double shortEdge;
    private double longEdge;

    public Rectangle(double shortEdge, double longEdge) {
        setLongEdge(shortEdge);
        setShortEdge(shortEdge);
    }

    @Override
    double area() {
        return (this.shortEdge * this.longEdge);
    }

    @Override
    double perimetre() {
        return ((this.shortEdge + this.longEdge) * 2);
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }
}
