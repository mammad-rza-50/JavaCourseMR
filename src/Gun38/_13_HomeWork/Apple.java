package Gun38._13_HomeWork;

public class Apple extends Phone {
    @Override
    public void options(String capasity, String screenSize) {

        if (capasity.contains("64") && screenSize.contains("5.5")) {
            cart.add("750$");
        } else if (capasity.contains("64") && screenSize.contains("6.5")) {
            cart.add("850$");
        } else if (capasity.contains("128") && screenSize.contains("5.5")) {
            cart.add("950$");
        } else if (capasity.contains("128") && screenSize.contains("6.5")) {
            cart.add("1200$");
        }
    }
}
