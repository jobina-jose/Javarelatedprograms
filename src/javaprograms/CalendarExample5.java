package javaprograms;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample5 {
    public static void main(String[] args) {
        DateFormatSymbols c= new DateFormatSymbols(new Locale("day"));
        String [] names= c.getShortWeekdays();
        for (String day:names){
            System.out.println(day);
        }

    }
}
