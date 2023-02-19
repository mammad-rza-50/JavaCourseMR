package Gun29._02_PrivateAccess;

public class Company {
    public static void main(String[] args) {

        Worker wrkr = new Worker();
        wrkr.id = 1;
        wrkr.name = "Memmed";
        wrkr.surname = "Rzayev";

        wrkr.passwordAssign("71214");
        wrkr.passwordAssign("712148085");
        wrkr.passwordShow();
    }
}
