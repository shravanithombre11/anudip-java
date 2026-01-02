import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeAndMonthDemo {

    public static void main(String[] args) {

        
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDateTime = dateTime.format(formatter);

        System.out.println("Formatted Date & Time:");
        System.out.println(formattedDateTime);

        System.out.println("\n----------------------------------\n");

       
        System.out.println("Month Name\tDays");

        for (Month month : Month.values()) {
            int days = month.length(false); // false = non-leap year
            System.out.println(month + "\t\t" + days);
        }
    }
}
