package Gun26._02_Sample;

public class Person {
    String name;
    String surName;
    int age;
   // int birthYear;


    public void infoWrhite() {
        System.out.println("name = " + name);
        System.out.println("surName = " + surName);
        System.out.println("age = " + age);
    }

    public String toString() {
        return name +".\t" +surName + "\t" +age;

    }
    public void getBirthYear(){

        System.out.println("Birth year= " + (2022-age));
    }
    public String getBirthYear1(){

        return "Birth year1= " + (2022-age);
    }
public void getInitials(){

    System.out.println(name.toUpperCase().charAt(0)+"."+
            surName.toUpperCase().charAt(0) + ".");
}

}