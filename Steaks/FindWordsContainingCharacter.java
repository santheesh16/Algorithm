package Steaks;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))){
                res.add(i);
            }
        }
		return res;
    }

    public static void main(String[] args) {
        FindWordsContainingCharacter find = new FindWordsContainingCharacter();
        String[] words = new String[]{"leet","code"};
        char x = 'e';
        System.out.println(find.findWordsContaining(words, x).toString());
    }
}
