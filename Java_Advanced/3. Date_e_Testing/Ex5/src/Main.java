//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//        verificare che la prima data è precedente alla seconda
//        verificare che la seconda data è successiva alla prima
//        verificare che le due date sono uguali ad ora
//        Stampa il risultato

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    public static void main(String[] args) {

        OffsetDateTime date1st = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime date2nd = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        OffsetDateTime dateNow1 = OffsetDateTime.now();
        String dateNow1Formatted = dateNow1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        OffsetDateTime dateNow2 = OffsetDateTime.now();
        String dateNow2Formatted = dateNow2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        OffsetDateTime todayDate = OffsetDateTime.now();
        String dateNow3rd = todayDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));

        firstBeforeSecond(date1st, date2nd);
        secondAfterFirst(date1st, date2nd);
        bothDatesEqualCurrentDateTIme(dateNow1Formatted, dateNow2Formatted, dateNow3rd);
    }

    public static void firstBeforeSecond(OffsetDateTime date1, OffsetDateTime date2) {
        if (date1.isBefore(date2)) {
            System.out.println("The 1st date is before the 2nd date");
        } else System.out.println("The 2nd date is after the 1st");
    }

    public static void secondAfterFirst(OffsetDateTime date1, OffsetDateTime date2) {
        if (date2.isAfter(date1)) {
            System.out.println("The 2nd date is after the 1st date");
        } else System.out.println("The 2nd date is before the 1st");
    }

    public static void bothDatesEqualCurrentDateTIme(String date1, String date2, String today) {
        if (date1.equals(today) && date2.equals(today)) {
            System.out.println("Both dates are equal to current DateTime");
        } else System.out.println("They're not");
    }
}