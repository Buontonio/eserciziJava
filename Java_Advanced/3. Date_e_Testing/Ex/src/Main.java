//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        aggiungi un anno
//        sottrai un mese
//        aggiungi 7 giorni
//        Stampa il risultato localizzata per l'Italia

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z").plusYears(1).minusMonths(1).plusWeeks(1);

        String editedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ITALY));
        System.out.println(editedDate);





    }
}