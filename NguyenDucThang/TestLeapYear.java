/*
 * This class is a junit test class for class LeapYear
 *
 * @author Nguyen Duc Thang
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLeapYear {
    @Test
    public void shouldReturnTrueWhenYearIs2016() {
        assertTrue("2016 must be a leap year.", LeapYear.isLeapYear(2016));
    }

    @Test
    public void shouldReturnFalseWhenYearIs2018() {
        assertFalse("2018 must be a normal year.", LeapYear.isLeapYear(2018));
    }

    @Test
    public void shouldReturnFalseWhenYearIs1990() {
        assertFalse("1900 must be a normal year.", LeapYear.isLeapYear(1900));
    }

    @Test
    public void shouldReturnTrueWhenYearIs2000() {
        assertTrue("2000 must be a leap year.", LeapYear.isLeapYear(2000));
    }

    @Test
    public void shouldReturnFalseWhenYearIs1997() {
        assertFalse("1997 must be a normal year.", LeapYear.isLeapYear(1997));
    }

    @Test
    public void shouldReturnTrueWhenYearIs1996() {
        assertTrue("1996 must be a leap year.", LeapYear.isLeapYear(1996));
    }
}
