package Gun31._02_Sample;

public class Question {

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username,role, statu) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    public static void main(String[] args) {

        User user1 = new User("Memmed", Role.Admin, Statu.Activ);
        User user2 = new User("Aynur", Role.Manager, Statu.Activ);
        User user3 = new User("Nuru", Role.Sales, Statu.Passiv);
        User user4 = new User("Aynur", Role.Persone, Statu.Activ);

        UserDelete(user1);
        UserDelete(user2);
        UserDelete(user3);
        UserDelete(user4);

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);
        System.out.println("user4 = " + user4);


    }

    public static void UserDelete(User user) {

        if (user.rolu == Role.Admin) {

            System.out.println(user.username + " Silinemez!!!");
        }
    }
}
