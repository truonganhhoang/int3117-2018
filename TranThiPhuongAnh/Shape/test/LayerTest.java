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
public class LayerTest {
    
    public LayerTest() {
    }

    /**
     * Test of eraseTriangleOfShape method, of class Layer.
     */
    @Test
    public void testEraseTriangleOfShape() {
        System.out.println("eraseTriangleOfShape");
        Layer instance = new Layer();
        instance.eraseTriangleOfShape();
    }

    /**
     * Test of eraseCircleOfShape method, of class Layer.
     */
    @Test
    public void testEraseCircleOfShape() {
        System.out.println("eraseCircleOfShape");
        Layer instance = new Layer();
        instance.eraseCircleOfShape();
    }
    
}
