package Gun28._01_Constructor;

public class Student {

    int id;
    String name;
    String surName;
    int clas;

    public Student() // yapici metodlar : Constructor metodlar
    {
        System.out.println("Object created");
    }  // nesne olusdururken yapmaq istediklerin ucun burayi kullan

    public Student(int id, String name, String surName, int clas) // Constructor
    {

        this.id = id; // this id: classin id si:
        this.name = name;
        this.surName = surName;
        this.clas = clas;

    }
    public Student(int id, String name, String surName) // Constructor
    {
        this(id,name,surName,0);  // this Student metodunun ozu
    }
}
