//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        String date = null;
        try {
            OffsetDateTime parsedDate = fromStringToDate(date);

            System.out.println(fromStringToDate(date));
            System.out.println(getYear(parsedDate));
            System.out.println(getMonth(parsedDate));
            System.out.println(getDay(parsedDate));
            System.out.println(getDayOfWeek(parsedDate));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        public static OffsetDateTime fromStringToDate (String string){
            if (string != null) {
                return OffsetDateTime.parse(string);
            } else {
                throw new NullPointerException("The string can't be parsed due to nullability");
            }
        }

        public static String getYear (OffsetDateTime date){
            return String.valueOf(date.getYear());
        }

        public static String getMonth (OffsetDateTime date){
            return String.valueOf(date.getMonth());
        }

        public static String getDay (OffsetDateTime date){
            return String.valueOf(date.getDayOfMonth());
        }

        public static String getDayOfWeek (OffsetDateTime date){
            return String.valueOf(date.getDayOfWeek());
        }
    }