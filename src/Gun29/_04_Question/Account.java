package Gun29._04_Question;

public class Account {
    private int accountAdd = 0;
    private int withDrawn = 0;
    private int balance = 0;


    void moneyAdd (int addMoney)
    {
        accountAdd+=addMoney;
        balance+=addMoney;

}
void withDrawnMoney( int moneyWithDrawn){

        withDrawn-=moneyWithDrawn;
        balance-=moneyWithDrawn;
}

    @Override
    public String toString() {
        return "Account{" +
                "accountAdd=" + accountAdd +
                ", withDrawn=" + withDrawn +
                ", balance=" + balance +
                '}';
    }
}
