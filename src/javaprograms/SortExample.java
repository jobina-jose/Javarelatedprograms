package javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortExample {
    public static void main (String args[] ){
        ArrayList<Integer> mynumber= new ArrayList<Integer>();
        mynumber.add(55);
        mynumber.add(78);
        mynumber.add(90);
        mynumber.add(10);
        mynumber.add(6);
        mynumber.add(41);
        mynumber.add(25);
        Collections.sort(mynumber,Collections.reverseOrder());
        for(int i : mynumber){
            System.out.println(i);
        }


    }
}
