package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListValues {

    public static List<String> res = new ArrayList<>();

    public static List<String> linkedListValues(Node<String> head) {

        if (head == null) {
            return res;
        }
        res.add(head.val);
        return linkedListValues(head.next);
    }

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        linkedListValues(a);
        // -> [ "a", "b", "c", "d" ]

    }

}
