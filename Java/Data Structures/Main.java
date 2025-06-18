import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {


    public void listExample() {
        // Create a new instance of the LinkedList class
        List<String> list = new ArrayList<String>();

        // Add elements to the list
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Print the elements of the list
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void arrayExample() {
        // Create a new instance of the LinkedList class
        int[] arr = new int[5];

        // Add elements to the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Print the elements of the array
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void hashMapExample() {
        // Create a new instance of the LinkedList class
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Key: " + i + ", Value: " + map.get(i));
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.hashMapExample();
        main.arrayExample();
        main.listExample();

        String[] str = new String[]{"One", "Two"};
        System.out.println(str.length);
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("I");
        list.add("Won");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        Iterator iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
