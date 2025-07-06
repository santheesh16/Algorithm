package Graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class HasPath {

    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {
        Stack<String> stack = new Stack<>();
        stack.push(src);
        while (!stack.isEmpty()) {
            String curr = stack.pop();
            if (curr == dst) {
                return true;
            }
            List<String> neigs = graph.get(curr);
            for (String neig : neigs) {
                stack.push(neig);
            }
        }
        return false;
    }

    public static boolean bsf(Map<String, List<String>> graph, String src, String dst) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add(src);
        while (!queue.isEmpty()) {
            String curr = queue.remove();
            if (curr == dst) {
                return true;
            }
            List<String> neigs = graph.get(curr);
            for (String neig : neigs) {
                queue.add(neig);
            }
        }

        return false;
    }

    public static boolean dsf(Map<String, List<String>> graph, String src, String dst) {
        if (src == dst) {
            return true;
        }
        List<String> neigs = graph.get(src);
        for (String neig : neigs) {
            if (dsf(graph, neig, dst)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of(
                "f", List.of("g", "i"),
                "g", List.of("h"),
                "h", List.of(),
                "i", List.of("g", "k"),
                "j", List.of("i"),
                "k", List.of());

        // System.out.println(hasPath(graph, "f", "k")); // true
        // System.out.println(dsf(graph, "f", "k")); // true
        System.out.println(bsf(graph, "f", "k")); // true

    }

}
