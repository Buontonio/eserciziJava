import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        longFormattedDate(date);
    }

    public static String longFormattedDate(OffsetDateTime date) {
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(formattedDate);
        return formattedDate;
    }
}