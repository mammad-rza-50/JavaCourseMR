package Repeat_03;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        int sayi; //hazıfazada 1 tane rakam saklayabiliyor
        int[] dizi=new int[10]; // hafızada 10 tane rakam saklayabiliyor.boyu sabit

        //dinamik zincir gibi ekledikçe artar, sildikçe azalır
        ArrayList<Integer> liste=new ArrayList<>();
        liste.add(30);
        liste.add(40);
        liste.add(50);
        liste.add(60);

        System.out.println(liste.size());
        System.out.println(liste);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }

        for(Integer e: liste)
            System.out.println("sayi = " + e);
    }




}
