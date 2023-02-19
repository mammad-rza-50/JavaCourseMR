package Gun36._05_Interface;

public class Test implements IShows,IWrites{
    @Override
    public void show() {

        System.out.println("Gosterdi");
    }

    @Override
    public void write(String msg) {
        System.out.println(msg);

    }

    @Override
    public void write() {
        System.out.println("Yazdirdi");

    }
}
