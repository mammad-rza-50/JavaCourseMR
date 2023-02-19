package Gun33._02_Sample;

public class Zoo {

    //    Bir hayvanat bahçesi için bir program yazılmak isteniyor.
//    Kediler için (renk,kilo,cinsi)
//    kopekler için (renk,kilo, cinsi)
//    yılanlar için renk, kilo, cinsi, uzunluk)
//    ordek için (renk, kilo, cinsi, kanatAcikligi)
//    bütün hayvanların konustu metodu vardır.

    public static void main(String[] args) {

        Dog dog1 = new Dog("black", 35, "Shepdog");
        dog1.speak();
        Cat cat1 = new Cat("White", 15, "Siam");
        cat1.speak();
        Snake snake1 = new Snake("Black",7,"Kobra",2);
        snake1.speak();
        Duck duck1 = new Duck("Green",4, "Dusk",0.7);
        duck1.speak();
        System.out.println(snake1.getLenght());

    }
}
