
/**
 *
 * @author phuc
 */
public class Scholarship {

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

//    public static void main(String[] args) {
//        String status0 = scholarship(-1, 123);
//        String status1 = scholarship(3, -1);
//        String status2 = scholarship(3.1, 90);
//        String status3 = scholarship(4.0, 79);
//        String status4 = scholarship(3.3, 89);
//        String status5 = scholarship(3.7, 100);
//        System.out.println(status0);
//        System.out.println(status1);
//        System.out.println(status2);
//        System.out.println(status3);
//        System.out.println(status4);
//        System.out.println(status5);
//    }
}
