package Gun36._06_Interface;

public class Rectangle implements ICalculate {

    @Override
    public double area(double shortEdge, double longedge) {
        return shortEdge*longedge;
    }

    @Override
    public double perimetre(double shortEdge, double longedge) {
        return (shortEdge+longedge)*2;
    }
}
