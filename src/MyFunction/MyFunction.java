package MyFunction;

public class MyFunction {

    public static void wait(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
