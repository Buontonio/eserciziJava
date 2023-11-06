import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(date);
        System.out.println(dateFormatter(yearAdder(monthSubtracter(dayAdder(date)))));
    }

    public static OffsetDateTime yearAdder(OffsetDateTime date) {
        return date.plusYears(1);
    }

    public static OffsetDateTime monthSubtracter(OffsetDateTime date) {
        return date.minusMonths(1);
    }

    public static OffsetDateTime dayAdder(OffsetDateTime date) {
        return date.plusDays(7);
    }

    public static String dateFormatter(OffsetDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ITALY));
    }
}