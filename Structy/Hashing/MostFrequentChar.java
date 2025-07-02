package Hashing;

import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Source;

public class MostFrequentChar {

    public static char mostFrequentChar(String s) {

        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        char res = '\0';
        int resCount = 0;
        for (char c : s.toCharArray()) {
            if (count.get(c) > resCount) {
                res = c;
                resCount = count.get(c);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mostFrequentChar("mississippi")); // -> 'e'
    }

}
