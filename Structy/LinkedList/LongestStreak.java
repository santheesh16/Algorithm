package LinkedList;

public class LongestStreak {

    public static <T> int longestStreak(Node<T> head) {
        if (head == null)
            return 0;
        T headVal = head.val;
        int streak = 0, count = 1;
        Node<T> curr = head.next;
        while (curr != null) {
            if (curr.val != headVal) {
                headVal = curr.val;
                count = 0;
            }
            curr = curr.next;
            count++;
            streak = Math.max(count, streak);
        }
        return streak;
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(9);
        Node<Integer> b = new Node<>(9);
        Node<Integer> c = new Node<>(1);
        Node<Integer> d = new Node<>(9);
        Node<Integer> e = new Node<>(9);
        Node<Integer> f = new Node<>(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // 9 -> 9 -> 1 -> 9 -> 9 -> 9

        System.out.println(longestStreak(a)); // 3
    }

}
