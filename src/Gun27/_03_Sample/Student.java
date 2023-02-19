package Gun27._03_Sample;

import java.util.ArrayList;

public class  Student {

    String name;
    int maxSaat ;
    ArrayList<Lesson> lessons = new ArrayList<>();

    public void lessonAdd(Lesson lesson) {

        int nowTotalTime = 0;

        for (Lesson lssn : lessons)

            nowTotalTime += lssn.time;

        if (nowTotalTime + lesson.time <= maxSaat)

            lessons.add(lesson);
        else
            System.out.println(lesson.name + ": Kredi sınırı aşıldı");

    }

    public void lessonsWhrite() {

        System.out.println("\n*** Transkript ***");

        System.out.println("Sayın " + name);

        System.out.println("Aldığınız dersler aşağıdadır.");

        for (Lesson d : lessons)
            System.out.println(d.name + " " + d.time);

    }
    public static void LawsUniversity(){

        System.out.println("######################################");
        System.out.println("             Uyari!!!\n");
        System.out.println("Universite daxilinde sigara icilmez!!!");
        System.out.println("Universitede sessizliye dikkat edin!!!");
        System.out.println("Kural1 : Kahvaltı yapmadan derse gelme");
        System.out.println("Kural2 : Uykunu mutlaka al, erken yat");
        System.out.println("Kural3 : Herzaman dinç dinamik ol");
        System.out.println("Kural4 : Başta verdiğini kararı UNUTMA!");
        System.out.println("Kural5 : Biz imkansızlıkları, inş aşacağız");
        System.out.println("######################################");
    }
}
