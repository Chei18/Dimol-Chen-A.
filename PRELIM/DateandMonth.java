
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateandMonth {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        String formattedDate = currentDate.format(customFormatter);
        System.out.println("Today's Date: " + formattedDate);
    }
}