import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anh Tran
 */
public class DiagramTest {

    /**
     * Test of eraseCircleOfLayerInDiagram method, of class Diagram.
     */
    @Test
    public void testEraseCircleOfLayerInDiagram() {
        System.out.println("eraseCircleOfLayerInDiagram");
        Diagram instance = new DiagramImpl();
        instance.eraseCircleOfLayerInDiagram();
    }

    /**
     * Test of main method, of class Diagram.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Diagram.main(args);
    }
    
}
