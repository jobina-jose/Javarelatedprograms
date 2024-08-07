package javaprograms;

import java.util.Calendar;

public class CalendarExample2 {
    public static void main(String[] args) {
//        int Year=2025;
//        int month=5;
//        int date=6;
        Calendar cal= Calendar.getInstance();
//        cal.set(Calendar.YEAR ,Year);
//        cal.set(Calendar.MONTH,month);
//        cal.set(Calendar.DATE,date);
        System.out.println(cal.getTime());
    }
}
