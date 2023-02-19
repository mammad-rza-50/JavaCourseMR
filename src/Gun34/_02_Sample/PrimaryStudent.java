package Gun34._02_Sample;

public class PrimaryStudent extends Student{
    private String club;

    public PrimaryStudent(String name, StudentType type, String club) {
        super( name, type);
        setClub(club);
    }

    public void setClub(String club) {
        this.club = club;
    }
    public String getClub() {
        return club;
    }

    @Override
    public String toString() {
        return "PrimaryStudent{" +
                "club='" + getClub() + '\'' +
                "} " + super.toString();
    }
}
