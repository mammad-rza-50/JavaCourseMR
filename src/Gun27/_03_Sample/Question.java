package Gun27._03_Sample;

public class Question {

    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Lesson : fields : name, saat (1-10 arasında değer alıyor).
    // 2- Student: fields : name, maxSaat, dersleri adında derslerini listesini tutacak bir liste.
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Saati geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max Saati doldu şeklinde.
    // 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.en basta
    //    yazdırınız.

    public static void main(String[] args) {

        Student.LawsUniversity();

        Lesson lesson1 = new Lesson();
        lesson1.name = "Java";
        lesson1.time = 4;

        Lesson lesson2 = new Lesson();
        lesson2.name = "Test tool";
        lesson2.time = 4;

        Lesson lesson3 = new Lesson();
        lesson3.name = "Soft Skills";
        lesson3.time = 3;

        Student student1 = new Student();
        student1.name = "Memmed Rzayev";
        student1.maxSaat = 10;

        student1.lessonAdd(lesson1);
        student1.lessonAdd(lesson2);
        student1.lessonAdd(lesson3);

        student1.lessonsWhrite();
    }
}
