package Gun34._03_Sample;

public class student {
    private final int ID;
    private String name;
private StudentType type;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }


    public student( String name, StudentType type, int ID) {
        this.ID = ID;
        setName(name);
        setType(type);
    }

    @Override
    public String toString() {
        return "student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}


