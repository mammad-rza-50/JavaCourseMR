package Gun32._03_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
    //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        School newSchool = new School("Saray mektebi", 4); // 15 max student count

        do {
            System.out.print("Oyrenci adi girin= ");
            String stdntName = scanStr.nextLine();

            System.out.print("Oyrenci soyadi girin= ");
            String stdntSurName = scanStr.nextLine();

            System.out.print("Oyrenci yasi girin= ");
            int stdntAge = scanInt.nextInt();
            if (stdntAge < 15){

                Student student = new Student( stdntName,stdntSurName,stdntAge);
                newSchool.getStudents().add(student);

            }
            else
                System.out.println("Oyrenci yasi uygun deyil!!! ");

        } while (newSchool.getStudents().size() < newSchool.getQuota());
        System.out.println("newSchool.getStudents(). = " + newSchool.getStudents()+ " " );
        

    }
}
