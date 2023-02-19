package Gun21;

public class _07_JavaArrayHomeAssignment3 {
    public static void main(String[] args) {

//     3.     Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
//              [{"new jersey","atlanta","ohio"} ,
//              {"Pittsburgh" ,"ohio","new york","ohio"} ,
//               {"ohio","new york"}]
//                  Bütün ohio'ları Florida'yla değiştiriniz.
//                               Array'i yazdırınız.

        String[][] cities = {{"new jersey", "atlanta", "ohio"},
                             {"Pittsburgh", "ohio", "new york", "ohio"},
                             {"ohio", "new york"}};

        for (int i = 0; i < cities.length; i++) {

            for (int j = 0; j < cities[i].length; j++) {

                if (cities[i][j] == "ohio") {

                    cities[i][j] = "Florida";
                }
                System.out.println(cities[i][j] + " ");
            }
            System.out.println();
        }
    }
}
