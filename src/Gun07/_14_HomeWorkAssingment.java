package Gun07;


import java.util.Scanner;

public class _14_HomeWorkAssingment {
    public static void main(String[] args) {

        //1--  **I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        String word1 = "I love Java";
        int uzunluq1 = word1.length();
        System.out.println("uzunluq1 = " + uzunluq1);

        // 2-- **Sprint planning** olan bir String oluşturun.
        //Bu dizenin _toplam karakter sayısını_ yazdırın.
        String word2 = "Sprint planning";
        int uzunluq2 = word2.length();
        System.out.println("uzunluq2 = " + uzunluq2);

        //3--  **apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.
        String word3 = "apple";
        boolean isHave = word3.contains("app");
        System.out.println("isHave = " + isHave);

        //4-- **orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
        String word4 = "orange";
        boolean equals1 = word4.equals("Apple");
        System.out.println("equals1 = " + equals1);

        // 5--  **apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir.
        String word5 = "apple";
        boolean equals2 = word5.toLowerCase().equals("apple");
        System.out.println("equals2 = " + equals2);

        //6--  **Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**
        // harfinin bulunduğu indexini yazdırın.
        String word6 = "Florida";
        int index1 = word6.indexOf("o");
        System.out.println("index1 = " + index1);

        //7--  **Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'**
        // harfinin bulunduğu _konumu_ yazdırın.

        String word7 = "Thank you";
        int index2 = word7.indexOf("y");
        System.out.println("index2 = " + index2);

        //8--  **Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
        String word8 = "Mouse";
        char karakter = word8.charAt(3);
        System.out.println("karakter = " + karakter);

        //9--  **paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE
        String word9 = "paper";
        String buyukHarf = word9.toUpperCase();
        System.out.println("buyukHarf = " + buyukHarf);

        //10--  **OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple
        String word10 = "OraNge";
        String kucukHarf = word10.toLowerCase();
        System.out.println("kucukHarf = " + kucukHarf);

        //11--  **New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın

        String word11 = "New Jersey";
        String buyukHarf1 = word11.toUpperCase();
        System.out.println("buyukHarf1 = " + buyukHarf1);

        //12--  **New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın.
        String word12 = "New York";
        String kucukHarf1 = word12.toLowerCase();
        System.out.println("kucukHarf1 = " + kucukHarf1);

        //13--  **PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.

        String word13 = "PADDLE";
        String boyukHarf2 = word13.toLowerCase();
        System.out.println("boyukHarf2 = " + boyukHarf2);

        // SPECIAL QUESTIONS

        // 1- Ayrı ayrı girilen ad ve soyadı aralarında
        // bir boşluk koyarak birleştiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String name = scan.nextLine();
        System.out.print("Soyadinizi girin: ");
        String surName = scan.nextLine();
        System.out.println("Adin ve Soyadin: " + name.concat(" ".concat(surName)));

        // 2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız
        System.out.println("Bir kelime girin: ");
        String word14 = scan.nextLine();
        boolean bosmu = word14.isEmpty();
        System.out.println("bosmu = " + bosmu);

        // 3- girilen bir cümledeki A harfi sayısını bulunuz.
        // (Büyük küçük harf ayırımı olmadan)

        System.out.println("Cumle giriniz: ");
        String word15 = scan.nextLine();
        String word15Trim = word15.toUpperCase().trim();

        System.out.println("cumleTrim = " + word15Trim);
        int word15Uzunlug = word15Trim.length();
        System.out.println("cumleUzunlugu = " + word15Uzunlug);

        String AharfSil = word15Trim.replace("A","");
        System.out.println("AharfSil = " + AharfSil);
        int AharfsilUzun = AharfSil.length();

        int AharfSayisi = word15Uzunlug - AharfsilUzun;

        System.out.println("AharfSayisi = " + AharfSayisi);

        // 4- girilen bir kelimenin ilk ve son harfini bulunuz.
        System.out.print("Bir kelime girin: ");
        String word16 = scan.nextLine();
        word16 = word6.trim();
        int sonHarf = word16.length();
        System.out.println("Kelimenin ilk harfi= " + word16.charAt(0));
        System.out.println("Kelimenin son harfi= " + word16.charAt(sonHarf - 1));


        // 5- girilen bir cümledeki ilk kelimeyi yazdırınız
        System.out.print("Bir cumle girin: ");
        String word18 = scan.nextLine();
        word18 = word8.trim();
        int ilkKelimeSonIndex = word18.indexOf(" ");
        String ilkKelime = word18.substring(0, ilkKelimeSonIndex);
        System.out.println("ilkKelime = " + ilkKelime);

       // 6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız
        System.out.println("Bir cumle girin: ");
        String word19 = scan.nextLine();
        word19 = word19.trim();
        int ilkKelimeSonIndex1 = word19.indexOf(" ");
        int ikinciKelimeSonIndex = word19.lastIndexOf(" ");
        System.out.println("Ilk kelime: "+word19.substring(0,ilkKelimeSonIndex1));
        System.out.println("ikinciKelime: " + word19.substring(ilkKelimeSonIndex,ikinciKelimeSonIndex));

     // 7- Girilen bir cümlede kaç kelime olduğunuz bulunuz

        System.out.print("Cumle giriniz: ");
        String word20 = scan.nextLine();
        System.out.println("cumle = " + word20);
        String word20Trim = word20.trim();
        int word20Uzunlug = word20Trim.length();
        System.out.println("cumleUzunlug = " + word20Uzunlug);
        String bosluqSil = word20Trim.replace(" ","");
        System.out.println("bosluqSil = " + bosluqSil);
        int word20UzunlugBosluqsuz = bosluqSil.length();
        System.out.println("cumleUzunBosluqsuz = " + word20UzunlugBosluqsuz);
        int kelimeSayi = (word20Uzunlug-word20UzunlugBosluqsuz)+1;
        System.out.println("kelimeSayi = " + kelimeSayi);


     // 8-Girilen bir cumledeki kelimelerin ilk harflerini hazdırınız
        System.out.print("Cumle giriniz: ");
        String word22 = scan.nextLine();
        System.out.println("word22.replaceAll(\"\\\\B\\\\s\",\"\") = " + word22.replaceAll("\\B\\S",""));




        // 9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        System.out.println("Bir tam isim girin: ");
        String word21 = scan.nextLine();
        String word21Trim = word21.trim();
        char isim1 =word21Trim.charAt(0);
        int isim2Index =word21Trim.indexOf(" ");
        char isim2 = word21Trim.charAt(isim2Index+1);
        int isim3Index = word21Trim.lastIndexOf(" ");
        char isim3 = word21Trim.charAt(isim3Index+1);
        System.out.print("Tam Ismin Bas harfleri: = " + isim1+ "."+isim2+ "."+isim3+".");


    }
}
