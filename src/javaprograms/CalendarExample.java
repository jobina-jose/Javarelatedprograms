package javaprograms;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        System.out.println("The current date : " +calendar.getTime());
        calendar.add(Calendar.MONTH,-6);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR,3);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,4);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR,5);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MINUTE,18);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.SECOND,50);
        System.out.println(calendar.getTime());

        System.out.println( calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println("At present year of calendar "+calendar.get(Calendar.YEAR));
        System.out.println("At present month of calendar's day : "+calendar.get(Calendar.MONTH));
        int max=calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum day of week "+max);
        int min=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum week of year: "+min);
    }
}
