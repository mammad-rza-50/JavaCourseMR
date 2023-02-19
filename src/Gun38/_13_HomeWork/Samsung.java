package Gun38._13_HomeWork;

public class Samsung extends Phone {
    @Override
    public void options(String capacity, String screenSize) {

        if (capacity.contains("256") && screenSize.contains("5.5")) {
            cart.add("1000$");
        } else if (capacity.contains("256") && screenSize.contains("7.5")) {
            cart.add("1200$");
        } else if (capacity.contains("512") && screenSize.contains("5.5")) {
            cart.add("1300$");
        } else if (capacity.contains("512") && screenSize.contains("7.5")) {
            cart.add("1400$");
        }
    }
}
