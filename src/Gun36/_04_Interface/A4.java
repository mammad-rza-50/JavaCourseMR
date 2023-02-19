package Gun36._04_Interface;
// 1 class 1 den cok Interface implement ede bilir
public class A4 implements IDraws,IShows{
    @Override
    public void draw() {
        System.out.println("Cekdir");
    }

    @Override
    public void show() {
        System.out.println("Goster");

    }
}
