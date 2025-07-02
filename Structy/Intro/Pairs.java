package Intro;

import java.util.ArrayList;
import java.util.List;

public class Pairs {

    public static List<List<String>> pairs(List<String> elements) {
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                List<String> curr = List.of(elements.get(i), elements.get(j));
                res.add(curr);
            }

        }
        for (List<String> list : res) {
            System.out.println(list.toString());
        }
        return res;
    }

    public static void main(String[] args) {
        pairs(List.of("a", "b", "c")); // ->
        // [
        // ["a", "b"],
        // ["a", "c"],
        // ["b", "c"]
        // ]
        pairs(List.of("a", "b", "c", "d")); // ->
        // [
        // ["a", "b"],
        // ["a", "c"],
        // ["a", "d"],
        // ["b", "c"],
        // ["b", "d"],
        // ["c", "d"]
        // ]

    }

}
