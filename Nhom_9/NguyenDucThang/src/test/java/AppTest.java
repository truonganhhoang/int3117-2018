/*
 * This class is a junit test class for LeapYear
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test 
    public void _2016_isALeapYear() {
        assertTrue("2016 must be a leap year.", LeapYear.isLeapYear(2016));
    }

    @Test 
    public void _2018_isNotALeapYear() {
        assertFalse("2018 must be a normal year.", LeapYear.isLeapYear(2018));
    }

    @Test 
    public void _1900_isNotALeapYear() {
        assertFalse("1900 must be a normal year.", LeapYear.isLeapYear(1900));
    }

    @Test 
    public void _2000_isLeapYear() {
        assertTrue("2000 must be a leap year.", LeapYear.isLeapYear(2000));
    }

    @Test 
    public void _1997_isNotALeapYear() {
        assertFalse("1997 must be a normal year.", LeapYear.isLeapYear(1997));
    }

    @Test 
    public void _1996_isLeapYear() {
        assertTrue("1996 must be a leap year.", LeapYear.isLeapYear(1996));
    }
}
