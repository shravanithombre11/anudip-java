import java.time.*;

public class DateExample{
    public static void main(String args[]) {
        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.minusDays(1));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.compareTo(time));
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getNano());
        System.out.println(time.hashCode());
       
        ZonedDateTime zn=ZonedDateTime.now();
        System.out.println(zn);
        System.out.println(zn.now());
        System.out.println(zn.plusDays(1));
        System.out.println(zn.getDayOfMonth());
        System.out.println(zn.getHour());

    }
}
