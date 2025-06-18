import java.util.HashMap;

public class ValidAnagram {

    public HashMap freqString(String str){
        HashMap<Character, Integer> freMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                freMap.put(c, freMap.getOrDefault(c,0) + 1);
            }
        }
        return freMap;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.freqString(s).equals(validAnagram.freqString(t)));   
    }
}
