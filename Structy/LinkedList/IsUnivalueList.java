package LinkedList;

public class IsUnivalueList {

    public static <T> boolean isUnivalueList(Node<T> head) {
        T headVal = head.val;
        Node<T> curr = head.next;
        while (curr != null) {
            if (curr.val != headVal) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(7);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(7);

        a.next = b;
        b.next = c;

        // 7 -> 7 -> 7

        System.out.println(isUnivalueList(a)); // true

    }

}
