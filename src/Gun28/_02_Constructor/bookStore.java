package Gun28._02_Constructor;

public class bookStore {

    // Book class yazınız.fields: name,publishYear,author.
    // 3 adet Consructor ekleyiniz.
    // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

    public static void main(String[] args) {

        Book book1 = new Book("Java", 1995, "Ceyms Qoslinq");
        Book book2 = new Book("Javayi oyren", "Memmed Rzayev");
        Book book3 = new Book();
        book3.name = "Java oyret";
        book3.publishYear = 2022;
        book3.author = "Ismet Temur";

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book3 = " + book3);

    }
}
