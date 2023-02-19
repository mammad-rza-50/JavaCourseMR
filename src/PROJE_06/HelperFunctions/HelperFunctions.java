package PROJE06.HelperFunctions;


import PROJE06.Database.Address;
import PROJE06.Models.User;

import java.util.ArrayList;

public class HelperFunctions {

    /*
        Proje kapsamında gerekli genel methodlari burada tanımlayacağız, buradaki methodlari birer doğrulayıcı yada
    oluşturucu olarak düşünebiliriz. Örneğin bir city nin varlığını doğrulama veya bir rastgele bir numara oluşturuma.
     */
    //---------------------------------------------------------------------------------------
    /*
        Bir method oluşturalım ve adına "checkCity" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir city almalı
        Eğer ki city:
            Address classinin icerisindeki static arrayliste bulunan bir city e eşit değilse
            bir RuntimeException firlatsin ve şu mesaji geçsin:
                "We can not continue your process because, there is no shipping that location."
        Eğer ki city:
            Arraylistin içerisinde var ise o zaman city i dondursun.
     */
    public static String checkCity(String city) {

        String twn = "We can not continue your process because, there is no shipping that location.";

        for (String town : Address.getCityList()) {

            try {

                if (town.equals(city)) {
                    return city;
                }

            } catch (Exception error) {
                System.out.println(twn);
            }
        }
        return twn;
    }
    /*

        Bir method oluşturalım ve adına "generateShippingTrackingNumber" diyelim,
            Tipi: static
            Return tipi: String
            Parametre: String türünden bir fullname, bir city, bir zipcode almalı

        Bu methodun amacı bir kargo takip numarasi üretmektir.

        kargo takip numarası şu şekilde oluşacak ve daha sonrada return olacaktır.

            city nin ilk 3 harfi + zipcode + fullname in baş harfleri

        son olarak ise dönen değer tamamen büyük harfde dönmelidir.

        örneğin bir takip kodu: IZM35430CK (Izmir + 35430 + Cem Karaca)

     */

    public static String generateShippingTrackingNumber(String fullname, String city, String zipCode) {
        String trackNumber = "";
        trackNumber += city.substring(0, 3) + zipCode;
        trackNumber += String.valueOf(fullname.charAt(0)) + fullname.charAt(fullname.indexOf(" ") + 1);

        return trackNumber.toUpperCase();
    }

    /*
            Bir method oluşturalım ve adına "checkZipCode" diyelim,
                Tipi: static
                Return tipi: String
                Parametre: String türünden bir zipCode almalı

            Eğer ki zipCode:
                5 rakamdan oluşmuyorsa RuntimeException firlatmalı ve mesaj olarak ise "Please enter valid Zip Code"
                geçmeli
            diğer durumda ise zipCode unu döndürmeli
         */
    public static String checkZipCode(String zipCode) {

        String zpCd = "Please enter valid Zip Code";

        try {
            if (zipCode.length() == 5) {
                return zipCode;
            }

        } catch (Exception error) {
            System.out.println(zpCd);
        }

        return zpCd;
    }

}

