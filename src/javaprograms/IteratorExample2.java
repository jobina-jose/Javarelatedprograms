package javaprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<Integer>();
        number.add(55);
        number.add(46);
        number.add(27);
        number.add(33);
        number.add(71);
        number.add(19);
        Iterator<Integer> it= number.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(number);
        for (int i : number){
            System.out.println(i);
        }
    }
}
