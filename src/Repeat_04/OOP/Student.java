package Repeat_04.OOP;

public class Student {
    String ad; //properties, field, attribute, özellik
    String soyad;
    String tel;

    // event, davranış, metod
    void KimlikYaz() {
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("tel = " + tel);
    }
}