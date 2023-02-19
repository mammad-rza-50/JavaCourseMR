package Gun31.QuestionOfDays;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrderLine {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
// TODO;  Her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Pizza> orders = new ArrayList<>();

        int chose = 0;
        do {
            // menu
            menu();
            chose = scan.nextInt();

            switch (chose) {

                case 1:
                    Pizza smallPizza = new Pizza(PizzaSize.Small);
                    orders.add(smallPizza);
                    break;
                case 2:
                    Pizza mediumPizza = new Pizza(PizzaSize.Medium);
                    orders.add(mediumPizza);
                    break;
                case 3:
                    Pizza largePizza = new Pizza(PizzaSize.Large);
                    orders.add(largePizza);
                    break;
                case 4:
                    orderWrite(orders);
            }


        } while (chose <= 4);

    }

    public static void menu() {

        System.out.println("******** Pizza Menü *******");
        System.out.println("1 - Small Pizza ");
        System.out.println("2 - Medium Pizza");
        System.out.println("3 - Large Pizza");
        System.out.println("4 - İşleme Al-Spiariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz=");

    }

    public static void orderWrite(ArrayList<Pizza> orders) {

        int s = 0, m = 0, l = 0;

        for (Pizza pizza : orders) {
            if (pizza.size == PizzaSize.Small) s++;
            else if (pizza.size == PizzaSize.Medium) m++;
            else if (pizza.size == PizzaSize.Large) l++;

        }
        System.out.println("***** Your order *****");
        System.out.println("Small pizza count= " + s);
        System.out.println("Medium pizza count= " + m);
        System.out.println("Large pizza count= " + l);
    }

}

