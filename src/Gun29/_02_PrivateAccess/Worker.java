package Gun29._02_PrivateAccess;

public class Worker {
    int id;   // qarsisinda hec ne yoxdursa Defaultdur
    String name;
    String surname;
    private String password;// ancaq oldugu classdan daxil olunur
            // sifreni ancaq kontrol ederek teyin etmek olur

    public void passwordAssign(String psw) {

        if (psw.length() < 8) {
            System.out.println("Sifre zaif");
        } else {
            password = psw; // adlar ferqli oldugu ucun this e ehtiyyac yoxdur
            System.out.println("Sifre basarili teyin oldu");
        }
    }

    public void passwordShow() {

        System.out.println("****" + password.substring(password.length() - 4));
    }
}
