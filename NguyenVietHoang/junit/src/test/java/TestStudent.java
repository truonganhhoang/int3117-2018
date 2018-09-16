import main.StudentManager;
import junit.framework.TestCase;

public class TestStudent extends TestCase {

    public void testFindStudentIndex() {
        StudentManager studentManager = new StudentManager();
        assertEquals(0, studentManager.findStudentIndexById(1));
    }

    public void testFindStudentIndexNull() {
        StudentManager studentManager = new StudentManager();
        assertEquals(-1, studentManager.findStudentIndexById(null));
    }

    public void testGetMaxGpa() {
        StudentManager studentManager = new StudentManager();
        assertEquals(3.9, studentManager.getMaxGpa());
    }

    public void testGetMinGpa() {
        StudentManager studentManager = new StudentManager();
        assertEquals(2.3, studentManager.getMinGpa());
    }

}
