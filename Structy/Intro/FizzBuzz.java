package Intro;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<Object> fizzBuzz(int n) {
        List<Object> res = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("fizzbuzz");
            } else if (i % 3 == 0) {
                res.add("fizz");
            } else if (i % 5 == 0) {
                res.add("buzz");
            } else {
                res.add(i);
            }
        }
        System.out.println(res.toString());
        return res;
    }

    public static void main(String[] args) {
        fizzBuzz(11); // -> [1,2,"fizz",4,"buzz","fizz",7,8,"fizz","buzz",11]

    }
}
