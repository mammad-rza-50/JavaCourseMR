package Mentoring6;

import java.util.HashMap;

public class _01_Question {
    public static void main(String[] args) {

        // Verilen Bir String de her harfin kac defa tekrar ettigini bulan bir method yaziniz...

            String word="Hello Java";
            HashMap<Object, Object> hmap = new HashMap<Object, Object>();

            for (int i = 0; i < word.length(); i++) {
                if(!hmap.containsKey(word.charAt(i)))
                {
                    hmap.put(word.charAt(i),1);
                }
                else
                {
                    int count= (int)hmap.get(word.charAt(i));
                    hmap.put(word.charAt(i),count+1);
                }
            }
            System.out.println(word);
            System.out.println(hmap);
        }
    }

