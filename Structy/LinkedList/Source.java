package LinkedList;

class Source {

    public static void printList(Node<String> head) {
        if (head == null) {
            return;
        }
        System.out.printf(head.val + " -> ");
        printList(head.next);
    }

    public static void main(String[] args) {
        Node<String> a = new Node<String>("a");
        Node<String> b = new Node<String>("b");
        Node<String> c = new Node<String>("c");

        a.next = b;
        b.next = c;

        printList(a);
    }
}
