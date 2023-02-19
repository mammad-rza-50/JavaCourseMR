package Gun30._01_StaticVariables.Sample1;

public class Student {
    String name;
    String surname;

    static String schoolName = "24 sayli mekteb";

    // sen bitanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Student(String name, String surname){

        this.name = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", school name" + schoolName +
                '}';
    }
}
