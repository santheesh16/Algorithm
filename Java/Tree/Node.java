package Java.Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Node {
    Node leftNode;
    Node rightNode;
    int value;
    public Node(Node left, Node right, int value){
        this.leftNode = left;
        this.rightNode = right;
        this.value = value;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(3%3);
    }
}
