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

        System.out.println(getYear(date));
        System.out.println(getMonth(date));
        System.out.println(getDay(date));
        System.out.println(getDayOfWeek(date));

    }

    public static String getYear(OffsetDateTime date){
        return String.valueOf(date.getYear());
    }

    public static String getMonth(OffsetDateTime date){
        return String.valueOf(date.getMonth());
    }

    public static String getDay(OffsetDateTime date){
        return String.valueOf(date.getDayOfMonth());
    }

    public static String getDayOfWeek(OffsetDateTime date){
        return String.valueOf(date.getDayOfWeek());
    }
}