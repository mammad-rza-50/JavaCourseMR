package Gun38._02_Abstract_Question;


public class GeometreMain {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(12, 14);
        rectangle.setName("Yeni duzbucagli");
        rectangle.draw();
        System.out.println(rectangle);
        Circle circle = new Circle(7);
        circle.setName("Yeni cevre");
        circle.draw();
        System.out.println(circle);


    }
}
