package Gun36._03_Interface;

public class GeometyMain {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw(); // Daire cekildi

        Rectangle rectangle = new Rectangle();
        rectangle.draw(); // Duzbucaqli cekildi

        // interface lerden object toretmek fakat referans tipi olur
        // bu bize Polimorphism sagladi
        // buradan asagi Polimorphism

        IDraw circle1 = new Circle();
        circle1.draw();// Daire cekir
         // direk olaraq sadece interfacedeki adi verilmis olan
        // metodlara  gede bilirsin

        IDraw rectangle1 = new Rectangle();
        rectangle1.draw(); // duzbucaq cekilir

        draws(circle1);
        draws(circle);
        draws(rectangle);
        draws(rectangle1);
    }
    public static void draws (IDraw idraw){
        idraw.draw();
    }
}
