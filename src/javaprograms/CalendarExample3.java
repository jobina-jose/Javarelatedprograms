package javaprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample3 {
    public static void main(String args[]){
          Calendar c= Calendar.getInstance();
//        System.out.println(c.get(Calendar.YEAR));
//        System.out.println(c.get(Calendar.MONTH));
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.MINUTE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.getActualMaximum(Calendar.HOUR_OF_DAY));
//        ZoneId zoneId=ZoneId.of("America/New_York");
//        ZonedDateTime zonedDateTime=ZonedDateTime.now(zoneId);
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String date=dateTimeFormatter.format(zonedDateTime);
//        System.out.println(date);
//        System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
//        System.out.println(c.getActualMaximum(Calendar.DATE));
//        System.out.println();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println();
        DateFormat df= new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);


        }
        System.out.println(df.format(c.getTime()));
    }
}
