package javaprograms;

import java.time.LocalTime;

public class ClendarExample6 {
    public static void main (String args[]){
        LocalTime t = LocalTime.now();

        LocalTime newTime =t.plusHours(4);
        System.out.println();
        System.out.println("Time after 2 hours : " + newTime);
        System.out.println();
    }
}
