package Gun32._03_Encapsulation;

public class Student {

    private int ID;
    private String name;
    private String surNmae;
    private int age;

    static int countID = 1;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Student(String name, String surNmae, int age) {
        setID(countID++);
        setName(name);
        setSurNmae(surNmae);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurNmae(String surNmae) {
        this.surNmae = surNmae;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getSurNmae() {
        return surNmae;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID" + ID+'\''+
                ", name='" + name + '\'' +
                ", surNmae='" + surNmae + '\'' +
                ", age=" + age +
                '}';
    }
}
