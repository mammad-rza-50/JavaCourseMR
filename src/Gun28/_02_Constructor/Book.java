package Gun28._02_Constructor;

public class Book {

    public String name;
    public int publishYear;
    public String author;

    public Book(String name, int publishYear, String author) {

        this.name = name;
        this.publishYear = publishYear;
        this.author = author;


    }

    public Book(String name, String author) {
        this(name, 0, author);


    }

    public Book() {


    }

    public String toString() {

        return name + " " + author + " " + publishYear;
    }
}
