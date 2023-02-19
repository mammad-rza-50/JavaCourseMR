package Gun31._02_Sample;

public class User {

    String username;
    Role rolu;
   Statu statu;

    public User(String username, Role rolu, Statu statu){

        this.username = username;
        this.rolu = rolu;
        this.statu = statu;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", rolu=" + rolu +
                ", statu=" + statu +
                '}';
    }
}
