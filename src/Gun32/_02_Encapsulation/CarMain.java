package Gun32._02_Encapsulation;

public class CarMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setColor("Green");
        car1.setModel("Kia");
        car1.setEngineVolume(2.0);
        car1.setDoorsCount(5);
        System.out.println("car1.getColor() = " + car1.getColor());
        System.out.println("car1.getModel() = " + car1.getModel());
        System.out.println("car1.getEngineVolume() = " + car1.getEngineVolume());
        System.out.println("car1.getDoorsCount() = " + car1.getDoorsCount());
        System.out.println("car1 = " + car1);

        Car car2 = new Car("Silver", "Mersedes", 2.7, 7);
        // constructor
        System.out.println("car2.getColor() = " + car2.getColor());
        System.out.println("car2.getModel() = " + car2.getModel());
        System.out.println("car2.getEngineVolume() = " + car2.getEngineVolume());
        System.out.println("car2.getDoorsCount() = " + car2.getDoorsCount());
        System.out.println("car2 = " + car2);

    }
}
