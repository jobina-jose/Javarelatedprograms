package javaprograms;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String args[]) {
        HashSet<Integer> number = new HashSet<Integer>();
        number.add(3);
        number.add(1);
        number.add(9);
        number.add(2);
        number.add(4);
        number.add(8);
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {;
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}