package Gun30._01_StaticVariables.Sample1;

public class School {
    public static void main(String[] args) {

        //       Ogrenci ogr1=new Ogrenci("ismet","Temur","Yıldırım Ilkokulu");
//        Ogrenci ogr2=new Ogrenci("Mehmet","Demir","Yıldırım Ilkokulu");
//        Ogrenci ogr3=new Ogrenci("Ayşe","Yıldız","Yıldırım Ilkokulu");
//
//
//        // ...
//        //...
//        Ogrenci ogr499=new Ogrenci("Uğur","Çolak","Yıldırım Ilkokulu");
//        Ogrenci ogr500=new Ogrenci("Tuğser","Bayrak","Yıldırım Ilkokulu");

        Student student1 = new Student("Memmed", "Rzayev");

        System.out.println("Student1= " + student1);

        Student.schoolName = "28 sayli mekteb";
        System.out.println("student1 tekrar" + student1);

        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi

        Student student2 = new Student("Nureddin", "Rzayev");
        System.out.println("student2= " + student2);
    }
}