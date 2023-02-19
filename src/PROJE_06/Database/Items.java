package PROJE06.Database;


import PROJE06.Models.User;

public class Items {

    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */

    public static double ItemName(String ItemName) {
        double totalN = 0;
        if (ItemName.equals("Rose teddy bear")) {
            totalN += 30;
        } else if (ItemName.equals("Iphone max")) {
            totalN += 850.23;
        } else if (ItemName.equals("laptop mouse")) {
            totalN += 23.5;
        } else if (ItemName.equals("Monitor")) {
            totalN += 90.23;
        } else if (ItemName.equals("charger")) {
            totalN += 43.2;
        } else if (ItemName.equals("hdmi cable")) {
            totalN += 5.9;
        } else if (ItemName.equals("mug")) {
            totalN += 30;
        }

        return totalN;

    }

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */

    public static double colorPrice(String color) {
        double totalC = 0;

        if (color.equals("Red")) {
            totalC += 10;
        } else if (color.equals("Blue")) {
            totalC += 6;
        } else if (color.equals("Black")) {
            totalC += 4;
        } else if (color.equals("White")) {
            totalC += 2;
        }
        return totalC;
    }

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */

    public static double customText(String text) {
        double totalT = 0;
        if (text.length() > 10) {
            totalT += 5;
        } else {
            totalT += 3;
        }

        return totalT;
    }

    //---------------------------------------------------------------------------------------


}



