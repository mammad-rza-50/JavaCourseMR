package Gun39._03_OOP_Question;

public class AB {

    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.message = " + a.message); // A-dan Hello
        B b = new B();
        System.out.println("b.message = " + b.message); // B-den Hello
        A a1 = new A();
        System.out.println("a1.message = " + a1.message); // A-dan Hello
    }
}
