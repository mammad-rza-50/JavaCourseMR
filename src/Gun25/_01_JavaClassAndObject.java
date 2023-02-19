package Gun25;

public class _01_JavaClassAndObject {

    // metodlarin yazildigi yer

    public static void main(String[] args) {

        // proqramin basladigi ve bittiyi yer

        Car myCar = new Car();  // Car tipin adi(class), myCar object(nesne)

        myCar.marka = "Kia";
        myCar.year = 2017;
        myCar.color = "Blue";
        myCar.engineVolume = 2.0;

        System.out.println("myCar.marka = " + myCar.marka);
        System.out.println("myCar.year = " + myCar.year);
        System.out.println("myCar.color = " + myCar.color);
        System.out.println("myCar.engine = " + myCar.engineVolume);


    }// durdugu yer

    // metodlarin yazildigi yer
}


// class---tipleri yazildigi yer
class Car {
    String marka;
    int year;
    String color;
    Double engineVolume;
}