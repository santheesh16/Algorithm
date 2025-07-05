package LinkedList;

public class ZipperLists {

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
        Node<T> curr1 = head1.next, curr2 = head2;
        Node<T> tail = head1;
        int count = 1;

        while (curr1 != null && curr2 != null) {
            if (count % 2 == 1) {
                tail.next = curr2;
                curr2 = curr2.next;
            } else {
                tail.next = curr1;
                curr1 = curr1.next;
            }
            count++;
            tail = tail.next;
        }
        if (curr1 != null)
            tail.next = curr1;
        if (curr2 != null)
            tail.next = curr2;
        return head1;
    }

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        a.next = b;
        b.next = c;
        // a -> b -> c

        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        Node<String> z = new Node<>("z");
        x.next = y;
        y.next = z;
        // x -> y -> z

        Source.printList(zipperLists(a, x));
        // a -> x -> b -> y -> c -> z

    }

}
