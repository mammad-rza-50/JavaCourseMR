package PROJE_01;

import java.util.Scanner;

public class Proje1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi girin= ");
        String name = scan.nextLine();

        System.out.println(name.toUpperCase().charAt(0) + name.substring(1) + " hosgeldin, soyisminizi girer misin?: ");
        String firstName = scan.nextLine();

        System.out.println(name.toUpperCase().charAt(0) + name.substring(1) + " " + firstName.toUpperCase().charAt(0) + firstName.substring(1) +
                " isminiz dogru ise \"Y\" tusua basiniz...");
        String key = scan.next();

        while (!key.equalsIgnoreCase("y")) {
            System.out.println("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin...");
            key = scan.next();
        }

        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");

        System.out.println("Lutfen kullanici adnizi belirleyin...:");
        String username = scan.next();

        System.out.println("Lutfen sifrenizi belirleyiniz...:");
        String password = scan.next();

        System.out.println("Sifrenizi tekrar giriniz...:");
        String repeatPassword = scan.next();

        while (!password.equals(repeatPassword)) {
            System.out.println("Yanlis veya hatali bir sifre girdiniz, lutfen tekrar deneyin...");
            repeatPassword = scan.next();
        }


        System.out.println("Tebrikler...\"" + username + "\" kullanici adiyla sisteme kayit oldunuz...");

    }


}

// Scanner class tanimlayin...

// Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...


// Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...


// Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
// Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
// Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
// ikazi verelim
// Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...


// Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
// ikazi verelim


// Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"


// Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"


// Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"


// Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
// lutfen tekrar deneyin..." ikazi verelim


// Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
// ikazi verelim...





