import org.junit.Assert;
import org.junit.Test;

public class WeekDayOfDateTest {

    @Test
    public void test() {
        WeekDayOfDate weekDayOfDate = WeekDayOfDate.getInstance();
        Assert.assertEquals(WeekDayOfDate.MONDAY, weekDayOfDate.getWeekDayOfDate(10,3,1997));
        Assert.assertEquals(WeekDayOfDate.MONDAY, weekDayOfDate.getWeekDayOfDate(24,9,2018));
        Assert.assertEquals(WeekDayOfDate.MONDAY, weekDayOfDate.getWeekDayOfDate(1,10,2018));
        Assert.assertEquals(WeekDayOfDate.THURSDAY, weekDayOfDate.getWeekDayOfDate(1,2,2018));
    }
}
