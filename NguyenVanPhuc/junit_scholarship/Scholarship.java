
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
    public static String scholarship(double averagePoint, int trainingPoint) {
        if (averagePoint < 0 || averagePoint > 4.0) {
            return "averagePoint must be in 0-4.0.";
        } else if (trainingPoint < 0 || trainingPoint > 100) {
            return "trainingPoint must be in 0-100.";
        } else if (averagePoint < 3.2 || trainingPoint < 80) {
            return "You don't receive Scholarship.";
        } else if (averagePoint >= 3.2 && averagePoint < 3.6) {
            return "You receive Scholarship I.";
        } else {
            return "You receive Scholarship II.";
        }
    }
}
