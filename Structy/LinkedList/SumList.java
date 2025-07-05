package LinkedList;

public class SumList {

    public static int sumList(Node<Integer> head) {

        int res = 0;
        Node<Integer> curr = head;
        while (curr != null) {
            res += curr.val;
            curr = curr.next;
        }
        return res;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(2);
        Node<Integer> b = new Node<>(8);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(-1);
        Node<Integer> e = new Node<>(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // 2 -> 8 -> 3 -> -1 -> 7

        sumList(a); // 19

    }
}
