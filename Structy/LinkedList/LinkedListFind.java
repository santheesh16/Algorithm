package LinkedList;

public class LinkedListFind {

    public static <T> boolean linkedListFind(Node<T> head, T target) {
        Node current = head;
        while (current != null) {
            if (target == current.val) {
                return true;
            }
            current = current.next;
        }
        return false;
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

        linkedListFind(a, "c"); // true

    }

}
