import org.junit.jupiter.api.Test;
import java.time.ZonedDateTime;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fullFormatter() {
        ZonedDateTime date = ZonedDateTime.parse("2002-03-01T13:00:00Z");
        String expResult = "venerdì 1 marzo 2002 13:00:00 Z";
        String actResult = Main.fullFormatter(date);
        assertEquals(expResult, actResult);
    }

    @Test
    void mediumFormatter() {
        ZonedDateTime date = ZonedDateTime.parse("2002-03-01T13:00:00Z");
        String expResult = "1 mar 2002, 13:00:00";
        String actResult = Main.mediumFormatter(date);
        assertEquals(expResult, actResult);
    }

    @Test
    void shortFormatter() {
        ZonedDateTime date = ZonedDateTime.parse("2002-03-01T13:00:00Z");
        String expResult = "01/03/02, 13:00";
        String actResult = Main.shortFormatter(date);
        assertEquals(expResult, actResult);
    }
}