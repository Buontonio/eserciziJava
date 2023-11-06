import org.junit.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.*;

public class MainTest {

    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    public void yearAdder() {
        OffsetDateTime expResult = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime actResult = Main.yearAdder(date);
        assertEquals(expResult, actResult);
    }

    @Test
    public void monthSubtracter() {
        OffsetDateTime expResult = OffsetDateTime.parse("2023-02-01T13:00:00Z");
        OffsetDateTime actResult = Main.monthSubtracter(date);
        assertEquals(expResult, actResult);
    }

    @Test
    public void dayAdder() {
        OffsetDateTime expResult = OffsetDateTime.parse("2023-03-08T13:00:00Z");
        OffsetDateTime actResult = Main.dayAdder(date);
        assertEquals(expResult, actResult);
    }

    @Test
    public void dateFormatter() {
        String expResult = "01-03-2023";
        String actResult = Main.dateFormatter(date);
        assertEquals(expResult, actResult);
    }
}