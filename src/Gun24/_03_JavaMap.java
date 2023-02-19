package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {

        HashMap<String,String> mCartVisit = new HashMap<>();
        mCartVisit.put("name", "Memmed Rzayev");
        mCartVisit.put("email", "blackmamed@gmail.com");
        mCartVisit.put("phone", "+994552460406");
        mCartVisit.put("adres", "Saray/Absheron");

        System.out.println("mKartVisit.get(\"name\") = " + mCartVisit.get("name"));
        System.out.println("mKartVisit.get(\"phone\") = " + mCartVisit.get("phone"));

        HashMap<String,String> aCartVisit = new HashMap<>();
        aCartVisit.put("name", "Aynure Rzayeve");
        aCartVisit.put("email", "moonlight@gmail.com");
        aCartVisit.put("phone", "+994777460406");
        aCartVisit.put("adres", "Saray/Absheron");

        HashMap<String, HashMap<String,String>> cartVizits = new HashMap<>();

        cartVizits.put("Memmedin karti",mCartVisit);
        cartVizits.put("Aynurenin karti",aCartVisit);

        System.out.println("cartVizits.get(\"Memmedin karti\") = " + cartVizits.get("Memmedin karti"));
        System.out.println("cartVizits.get(\"Aynurenin karti\") = " + cartVizits.get("Aynurenin karti"));

        System.out.println("cartVizits.get(\"Memmedin karti\").get(\"adres\") = " + cartVizits.get("Memmedin karti").get("adres"));

        for (Map.Entry<String, HashMap<String,String>> cv:cartVizits.entrySet()) {
            System.out.println("cv.getValue().get(\"email\") = " + cv.getValue().get("email"));
        }

    }
}
