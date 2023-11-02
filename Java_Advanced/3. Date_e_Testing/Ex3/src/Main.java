//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String getYear = String.valueOf(date.getYear());
        String getMonth = String.valueOf(date.getMonth());
        String getDay = String.valueOf(date.getDayOfMonth());
        String getDayOfWeek = String.valueOf(date.getDayOfWeek());


        System.out.println(getYear);
        System.out.println(getMonth);
        System.out.println(getDay);
        System.out.println(getDayOfWeek);

    }
}