package PROJE_3_1;

import java.util.List;

public class Customer {
    String username;
    String password;

    public List<Account>accounts;

    public Customer(String username, String password, List<Account> accounts) {
        this.username = username;
        this.password = password;
        this.accounts = accounts;
    }
}
