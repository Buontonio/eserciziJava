import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String first = zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String second = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String third = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}