package javaprograms;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println("The current date : "+c.getTime());
        c.add(Calendar.MONTH,8);
        System.out.println(c.getTime());
        c.add(Calendar.YEAR,4);
        System.out.println(c.getTime());

    }
}
