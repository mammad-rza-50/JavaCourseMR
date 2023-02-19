package Gun32._01_Encapsulation;

public class Man {

    private String name;
    private String surName;
    private int age;


    void ageAssign(int age) { // setter

        if (age > 0 && age < 150)
            this.age = age;
        else
            System.out.println("Fail age");
    }

    int ageGive() {   // getter

        return this.age;
    }

    void setSurName(String surName) {

        if (surName.length() < 25)
            this.surName = surName;
        else System.out.println("Fail surname");
    }

    String getSurName() {
        return this.surName;
    }

    void setname(String name) {

        if (name.length() < 25)
            this.name = name;
        else System.out.println("Fail name");
    }

    String getname() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
