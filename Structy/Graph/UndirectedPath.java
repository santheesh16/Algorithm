package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class UndirectedPath {

    public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
        Map<String, List<String>> hashMap = new HashMap<>();
        Set<String> visied = new HashSet<>();
        for (List<String> nighs : edges) {
            String a = nighs.get(0);
            String b = nighs.get(1);
            hashMap.putIfAbsent(a, new ArrayList<>());
            hashMap.putIfAbsent(b, new ArrayList<>());
            hashMap.get(a).add(b);
            hashMap.get(b).add(a);
        }

        Stack<String> stack = new Stack<>();
        stack.push(nodeA);
        while (!stack.isEmpty()) {
            String curr = stack.pop();
            if (curr == nodeB) {
                return true;
            }
            List<String> neigs = hashMap.get(curr);
            for (String string : neigs) {
                if (visied.contains(curr)) {
                    break;
                }
                stack.push(string);
                visied.add(string);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<String>> edges = List.of(
                List.of("i", "j"),
                List.of("k", "i"),
                List.of("m", "k"),
                List.of("k", "l"),
                List.of("o", "n"));

        System.out.println(undirectedPath(edges, "m", "j")); // -> true

    }
}
