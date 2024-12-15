import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest2 {
    @Test
    public void testToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(0.0, converter.toCelsius(32), 0.01);
    }
}
