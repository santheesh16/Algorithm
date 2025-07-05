package LinkedList;

public class RemoveNode {

    public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
        if (head.val == targetVal) {
            return head.next;
        }
        Node<T> curr = head, prev = null;
        while (curr.val != targetVal && curr != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return head;
    }

    public static void main(String[] args) {

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // a -> b -> c -> d -> e -> f

        Source.printList(removeNode(a, "c"));
        // a -> b -> d -> e -> f

        Node<String> q = new Node<>("q");
        Node<String> r = new Node<>("r");
        Node<String> s = new Node<>("s");

        q.next = r;
        r.next = s;

        // q -> r -> s

        Source.printList(removeNode(q, "q"));
        // r -> s

    }

}
