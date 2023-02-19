package Gun44;

public class OCA_exam04 { // sual 24
    public static void main(String[] args) {

        String [] strs = new String[2];
        int idx = 0;
        // String ifadelerinin dizilerinde
        for (String s : strs){
            strs[idx].concat(" element " + idx);
        }

        for (int i = 0; idx <strs.length ; i++) {
            System.out.println(strs[idx]);
            // NullPointerException
        }
    }
}
