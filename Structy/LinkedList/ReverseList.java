package LinkedList;

public class ReverseList {

    public static <T> Node<T> reverseList(Node<T> head) {
        Node<T> prevNode = null, currNode = head;
        while (currNode != null) {
            Node<T> temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
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

        reverseList(a); // f -> e -> d -> c -> b -> a

    }
}
