package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _03_Java2DArrayListQuestion {
    public static void main(String[] args) {

        ArrayList<Integer> mathNots = new ArrayList<>();
        ArrayList<Integer> physicsNots = new ArrayList<>();
        ArrayList<Integer> chemicalNots = new ArrayList<>();

        mathNots.add(40);
        mathNots.add(50);
        mathNots.add(60);

        physicsNots.add(30);
        physicsNots.add(40);

        chemicalNots.add(70);
        chemicalNots.add(80);
        chemicalNots.add(90);
        chemicalNots.add(100);

        ArrayList<ArrayList<Integer>  > notsList = new ArrayList<>();
        notsList.add(mathNots);
        notsList.add(physicsNots);
        notsList.add(chemicalNots);

        //     Soru 1:
        //        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        //        // her bir satıra yazdırınız
        //        // Matematik : 40 50 60
        //        // Fizik : 30 40
        //        // Kimya : 70 80 90 100

        ArrayList<String> lesson = new ArrayList<>();
        lesson.add("Matematik");
        lesson.add("Fizik");
        lesson.add("Kimyak");

        for (int i = 0; i < notsList.size(); i++) {
            System.out.print(lesson.get(i)+" : ");
            for (int j = 0; j < notsList.get(i).size(); j++) {
                System.out.print(notsList.get(i).get(j) + "\t");

            }
            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  notunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        System.out.println("***********************");
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen ders notunu girin: 0-Matematik, 1-Fizik, 2-Kimya  tuslariana basin");
        int lessonNot = scan.nextInt();


        lessonNotWrite(notsList, lessonNot);

        // Soru 3 :
        // Yukarıda verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.
        
        kecenSayisi(notsList, lessonNot);


    }
    public static void lessonNotWrite(ArrayList<ArrayList<Integer>  > notsList, int lessonNot){

        for (int i = 0; i < notsList.get(lessonNot).size(); i++) {

            System.out.print(notsList.get(lessonNot).get(i) + "\t");
        }
    }
    public static void kecenSayisi(ArrayList<ArrayList<Integer>  > notsList,int lessonNot){

        int total=0;

        for (int i = 0; i < notsList.get(lessonNot).size(); i++) {
            total+=notsList.get(lessonNot).get(i);

        }
        int orta = total/notsList.get(lessonNot).size();
        int kecenSay = 0;
        for (int i = 0; i < notsList.get(lessonNot).size(); i++) {
            if (notsList.get(lessonNot).get(i) >= orta)
                kecenSay++;

        }
        System.out.println("\n"+"Orta = " + orta);
        System.out.println("KecenSay = " + kecenSay);
    }
    
}
