package Gun47;

public class MyField {

    int x;  // default 0
    int y;  // default  0

    public void doStuff(int x, int y) { // 100 200 geldi
        x = x; // parametreni parametre teyin etdi  objenin x-i deyismedi
        y = this.y; // objenin deyeri deyismedi  this.y=y olsa idi teyin ederdi
    }

    public void display() {

        System.out.println(x + " " + y + ":");
    }

    public static void main(String[] args) {

        MyField m1 = new MyField();
        m1.x = 100;
        m1.y = 200;

        MyField m2 = new MyField();
        m2.doStuff(m1.x, m2.y); // 100 200 getti

        m1.display(); // 100 200
        m2.display(); //  0   0

    }
}
