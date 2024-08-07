package javaprograms;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestTime {
    public static void main(String[] args) {
        LocalTime myobj= LocalTime.now();
       System.out.println(myobj);
        LocalDateTime obj= LocalDateTime.now();
        System.out.println(obj);
        DateTimeFormatter date= DateTimeFormatter.ofPattern("E-MMM-dd-YYYY HH:MM:SS ");
        String formatteddate= obj.format(date);
        System.out.println(formatteddate);
    }
}
