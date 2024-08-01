package Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> trainees = new HashMap<>();

        trainees.put("Gaurav","Bangalore");
        trainees.put("Rose","Kerala");
        trainees.put("Sandra","Kerala");
        trainees.put("Abel","Kerala");

        // System.out.println(trainees.get("Harsh"));

        for (String key:trainees.keySet()){
            System.out.println(key+ " : "+trainees.get(key));
        }

        //count letters
        String word = "facebook";
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        char[] arr = word.toCharArray();

        for (char c : arr) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }


        System.out.println(charCount);

    }
}