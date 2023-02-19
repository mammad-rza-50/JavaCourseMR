package Gun37._01_Question;

import java.util.ArrayList;

public class CarsMain {
    public static void main(String[] args) {

        TeslaCar teslaCar = new TeslaCar("Model X", 250);

        ToyotaPrius toyotaPrius = new ToyotaPrius("Prius V", 1800);

        Bus bus = new Bus("Mersedes Sprinter", 2700);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(teslaCar);
        vehicles.add(toyotaPrius);
        vehicles.add(bus);

        for (Vehicle vehicle : vehicles) {
            System.out.println("---------------------------------");
            System.out.println(vehicle.getClass().getSimpleName());
            System.out.println("---------------------------------");
            System.out.println("Model= " + vehicle.getModel());
            System.out.println("Engine= " + vehicle.getEngine());

            if (vehicle instanceof TeslaCar) {
                System.out.println(((TeslaCar) vehicle).drive());
                System.out.println(((TeslaCar) vehicle).changeBaterry());
            } else if (vehicle instanceof ToyotaPrius) {
                System.out.println(((ToyotaPrius) vehicle).changeBaterry());
                System.out.println(((ToyotaPrius) vehicle).drive());
                System.out.println(((ToyotaPrius) vehicle).changeOil());
            } else if (vehicle instanceof Bus) {
                System.out.println(((Bus) vehicle).changeDizel());
                System.out.println(((Bus) vehicle).drive());
            }
        }
    }
}

