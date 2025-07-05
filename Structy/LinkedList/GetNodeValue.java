package LinkedList;

public class GetNodeValue {

    public static <T> T getNodeValue(Node<T> head, int index) {
        int i = 0;
        Node<T> curr = head;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        return null;
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

        getNodeValue(a, 2); // "c"

    }
}
