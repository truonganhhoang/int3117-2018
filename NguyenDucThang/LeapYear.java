/*
 * This is LeapYear class
 *
 * @author Nguyen Duc Thang
 */
public class LeapYear {

    /*
     * this function check if a year is a leap year or not
     * @param year the year to be checked
     * @return the input number is a leap year or not
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    /*
     * the main function of the application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(String.format("%d is %s.", 2016, isLeapYear(2016) ? "Leap Year" : "Normal Year"));
    }
}
