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
