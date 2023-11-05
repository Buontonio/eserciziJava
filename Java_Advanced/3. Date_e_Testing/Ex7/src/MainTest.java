import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void longFormattedDate() {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String expResult = "01 marzo 2023";
        String actResult = Main.longFormattedDate(date);
        assertEquals(expResult, actResult);
    }
}