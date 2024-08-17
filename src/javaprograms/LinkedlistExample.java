package javaprograms;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

        }
//        System.out.println("the linked list is "+linkedList);
//        linkedList.addFirst("Apple");
//        System.out.println(linkedList);
//        linkedList.addLast("Elephant");
//       System.out.println(linkedList.getLast());
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.get(3));
//
//        System.out.println(linkedList);
//        linkedList.getLast();
//        System.out.println(linkedList);
//        linkedList.removeFirst();
//        System.out.println(linkedList);
//        linkedList.removeLast();
//        System.out.println(linkedList);
    }
}