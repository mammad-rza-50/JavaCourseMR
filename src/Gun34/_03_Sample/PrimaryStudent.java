package Gun34._03_Sample;

public class PrimaryStudent extends student {
    private String club;

    private static int PrimaryIdCount=1;

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }


    public PrimaryStudent(String name, StudentType type, String club) {
        super( name, type,PrimaryIdCount++);
        setClub(club);
    }
    @Override
    public String toString() {
        return "PrimaryStudent{" +
                "club='" + club + '\'' +
                "} " + super.toString();
    }
}
