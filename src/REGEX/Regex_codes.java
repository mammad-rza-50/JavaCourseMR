package REGEX;

public class Regex_codes {
    public static void main(String[] args) {

        String EXAMPLE_TEST = "Bu, içerisinde regular expression ifadelerini test edebileceğim örnek bir test cümlesidir";

        //. (nokta) herhangi bir karakter gelebileceğini ifade eder
        //noktadan sonra gelen * ise bu noktanın istediği kadar eşleşebileceği anlamına gelir
        //daha sonra "içerisinde" stringi bulunur
        //daha sonra yine .* kullanılarak sonunda istediği kadar karakter gelebilir.,
        //Bu ifade bizim test stringimize uyduğu için true ifadesi döner.
        //true
        System.out.println("1->" + EXAMPLE_TEST.matches(".*içerisinde.*"));

        //"içerisinde" kelimesinden sonra .* 'ı siliyorum. Böylece "içerisinde" kelimesinden
        //sonra hiçbir şey gelmemesi gerekiyor.
        //false
        System.out.println("2->" + EXAMPLE_TEST.matches(".*içerisinde"));

        //"cümlesidir" kelimesi zaten sonda olduğu için "cümlesidir" kelimesinden sonra herhangi
        //birşey kabul etmiyoruz.
        //true
        System.out.println("3->" + EXAMPLE_TEST.matches(".*cümlesidir"));

    }
}
