import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void getYear() {
        String expResult = "2023";
        assertEquals(expResult, Main.getYear(date));
    }

    @Test
    void getMonth() {
        String expResult = "MARCH";
        assertEquals(expResult, Main.getMonth(date));
    }

    @Test
    void getDay() {
        String expResult = "1";
        assertEquals(expResult, Main.getDay(date));
    }

    @Test
    void getDayOfWeek() {
        String expResult = "WEDNESDAY";
        assertEquals(expResult, Main.getDayOfWeek(date));
    }
}