package LinkedList;

public class InsertNode {

    public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
        if (index == 0) {
            Node<T> newNode = new Node<>(value);
            newNode.next = head;
            return newNode;
        }
        Node<T> curr = head;
        int i = 0;
        while (curr != null) {
            if (i == index - 1) {
                Node<T> newNode = new Node<>(value);
                newNode.next = curr.next;
                curr.next = newNode;
                break;
            }
            curr = curr.next;
            i++;
        }
        return head;
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

        Source.printList(insertNode(a, "x", 2));
        // a -> b -> x -> c -> d

    }

}
