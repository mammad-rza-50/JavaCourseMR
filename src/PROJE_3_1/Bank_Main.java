package PROJE_3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Banka Islemleri (Actions) Class indan bir liste olusturun...4 adet islem tanimlayin "Para_Yatir", "Para_Cek", "Transfer", "Cikis"...
        Actions actions1 = new Actions("Para_Yatir");
        Actions actions2 = new Actions("Para_Cek");
        Actions actions3 = new Actions("Transfer");
        Actions actions4 = new Actions("Cikis");
        List<Actions> actions = new ArrayList<>(Arrays.asList(actions1, actions2, actions3, actions4));
        // Her musteri (Customer) icin 2 adet hesap (Account) tanimlayin.. Hesap sinifi hesap numarasi ve hesaptaki para miktarini icermeli...
        Account user1_account1 = new Account(1234, 500);
        Account user1_account2 = new Account(4321, 700);
        Account user2_account1 = new Account(5678, 1000);
        Account user2_account2 = new Account(8765, 1200);
        Account user3_account1 = new Account(7890, 1400);
        Account user3_account2 = new Account(9870, 2500);
        // Banka musterilerini Customer sinifindan objeler olusturarak liste olarak tanimlayin...Customer sinifinda bir musteriye ait
        // username, password ve birden fazla hesap (Account) bulunmalidir...Buna gore bu musterileri burada tanimlayin...
        Customer customer1 = new Customer("User1", "password1", Arrays.asList(user1_account1, user1_account2));
        Customer customer2 = new Customer("User2", "password2", Arrays.asList(user2_account1, user2_account2));
        Customer customer3 = new Customer("User3", "password3", Arrays.asList(user3_account1, user3_account2));
        List<Customer> customers = new ArrayList<>(Arrays.asList(customer1, customer2, customer3));
        // Asagidaki kodda KIRMIZI olarak gorulen yerler sizin olustiracaginiz siniflar ve yukarida tanimlayacaginiz objeler ile
        // normal olarak calisacaktir...
        Customer activeUser;
        Account chosen_Account;

        while (true) {
            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            // -> Bu methodu asagida hangi kullanicinin giris yaptigini belirlemek maksadiyla kullanacaksiniz, olusturun...
            activeUser = confirmUsernameAndPassword(customers, username, password);

            if (activeUser != null) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        // Actions starts here
        while (true) {
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i).description + " - " + (i + 1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice) {

                case 1: {
                    while (true) {
                        System.out.println("Zehmet olmasa pul elave etmek istediyiniz hesabi girin.");
                        for (Account accnt : activeUser.accounts) {
                            System.out.println(accnt.number);
                        }
                        String chose = scan.next();
                        chosen_Account = confirmAccountNumber(activeUser, chose);
                        if (chosen_Account == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        break;
                    }
                        System.out.println("Zehmet olmasa istediyiniz pul miqdarini elave edin.");
                        // Para yatirma ozelligini aktif hale getirin...
                    /*
                    Kullaniciya ait hesaplari listeleyerek hangi hesap numarasina para yatirmak istedigini sorun...
                    Kullanicinin sectigi hesap numarasi hatali ise ikaz ederek tekrar basa dondurun...
                    Secim confirmAccountNumber(currentCustomer, chosen); methodu tarafindan dogrulanirsa
                    Ne kadar para yatirmak istedigini sorun...
                    Ve kullanicinin girdisini alarak hesaptaki para miktarini arttirin...
                                        */
                        int amountAdd = scan.nextInt();
                        chosen_Account.funds += amountAdd;
                        System.out.println("Secilen " + chosen_Account.number + "-daki balansiniz=  " + chosen_Account.funds + " $ oldu");
                        break;
                    }

                case 2: {
                    while (true) {
                        // Burada artik sadece o kullaniciya ait banka hesaplari listeleniyor... CLASS kullanmainin faydalari...
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : activeUser.accounts) {
                            System.out.println(account.number);
                        }
                        String chose = scan.next();
                        // confirmAccountNumber() methodunu kullanicinin dogru hesap bilgileri girdigini teyit etmek amacli kullanacaksiniz..
                        chosen_Account = confirmAccountNumber(activeUser, chose);
                        if (chosen_Account == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int chosenMoney = scan.nextInt();
                        // withdraw() methodunu kullanicinin hesabinda yeterli bakiye varsa bakiyesinden paranin dusulmesi,
                        // Yeterli bakiye yoksa kullanicinin uyarilmasi maksadiyla kullanacaksiniz...Olusturun
                        if (!withdraw(chosen_Account, chosenMoney)) {
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }
                case 4:
                    System.exit(1);

                default: {
                    System.out.println("Basarili bir secim yapmadiniz...");
                }
            }
        }
    }

    //TODO - Asagidaki 3 methodun return tipini ve icerigini tanimlayin ki yukarida olmasi gerektigi gibi sonuc versinler...

    public static Customer confirmUsernameAndPassword(List<Customer> users, String username, String password) {

        for (Customer cstmr : users) {
            if (cstmr.username.equals(username) && cstmr.password.equals(password))
                return cstmr;
        }
        return null;
    }

    public static Account confirmAccountNumber(Customer currentUser, String chosenAccount) {
        int chosen = Integer.parseInt(chosenAccount);
        for (Account accnt : currentUser.accounts) {
            if (accnt.number == chosen)
                return accnt;

        }
        return null;

    }

    public static boolean withdraw(Account chosenAccount, int amountToWithdraw) {

        if (chosenAccount.funds < amountToWithdraw) {
            System.out.println("Hesabinizda yeterli migdar yoxdur...");
            return true;
        }
        chosenAccount.funds -= amountToWithdraw;
        System.out.println("Zehmet olmasa pulunuzu goturun. " + "\n" + "Secilen "+chosenAccount.number+"-daki balansinizda= " + chosenAccount.funds+ " $ qaldi");
        return false;
    }

}


