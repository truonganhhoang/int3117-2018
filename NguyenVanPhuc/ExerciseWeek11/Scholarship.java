
/**
 * Main class to calculate scholarship for students
 *
 * @author phuc
 */
public class Scholarship {

    /**
     * Calculate scholarship for students
     * @param averagePoint student's average point in term
     * @param trainingPoint student's training point in term
     * @return result of considering scholarship of student
     */
    public static String scholarship(double aP, int tP) {
        if (aP < 0 || aP > 4.0) {
            return "aP in 0-4.0.";
        } else if (tP < 0 || tP > 100) {
            return "tP in 0-100.";
        } else if (aP < 3.2 || tP < 80) {
            return "No Scholarship.";
        } else if (aP >= 3.2 && aP < 3.6) {
            return "Scholarship I.";
        } else {
            return "Scholarship II.";
        }
    }
}
