//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime date1 = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        System.out.println(fullFormatter(date1));
        System.out.println(mediumFormatter(date1));
        System.out.println(shortFormatter(date1));

    }

    public static String fullFormatter(ZonedDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }

    public static String mediumFormatter(ZonedDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }

    public static String shortFormatter(ZonedDateTime date) {
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }
}