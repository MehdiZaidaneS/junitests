import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(10.0, tc.fahrenheitToCelsius(50), 0.01);
        assertEquals(-23.33, tc.fahrenheitToCelsius(-10), 0.01);
        assertEquals(-17.78, tc.fahrenheitToCelsius(0), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(50.0, tc.celsiusToFahrenheit(10), 0.01);
        assertEquals(14.0, tc.celsiusToFahrenheit(-10), 0.01);
        assertEquals(32.0, tc.celsiusToFahrenheit(0), 0.01);
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(tc.isExtremeTemperature(55));
        assertTrue(tc.isExtremeTemperature(-50));
        assertFalse(tc.isExtremeTemperature(30));
        assertFalse(tc.isExtremeTemperature(0));
        assertFalse(tc.isExtremeTemperature(-40));
        assertFalse(tc.isExtremeTemperature(50));
    }
}