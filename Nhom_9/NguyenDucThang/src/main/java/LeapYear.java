/*
 * This is main class
 */
public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if(year % 100 == 0) {
                if (year % 400 == 0) 
                    return true; 
                else
                    return false;
            } else
                return true;
        } else 
            return false;
    }

    public static void main(String[] args) {
        System.out.println(String.format("%d is %s.", 2016, isLeapYear(2016) ? "Leap Year":"Normal Year"));
    }
}
