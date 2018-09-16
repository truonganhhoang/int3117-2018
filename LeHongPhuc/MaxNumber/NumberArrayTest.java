import java.util.*;
import junit.extensions.TestSetup;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.assertEquals;

public class NumberArrayTest extends TestCase {
  private NumberArray numberArray;

  protected void setUp() throws Exception {
    this.numberArray = new NumberArray();
  }

  public void tearDown() {}

  @Test
  public void testInitialNumberArray() {
    assertNull("Verify that object is null", this.numberArray.numbers);
  }

  public void testGetElementById() {
    System.out.println("Begin testElementById()");
    Random rand = new Random();
    int indentationNumber = rand.nextInt(this.numberArray.numbers.length);
    assertSame("These 2 numbers should be same.", this.numberArray.numbers[indentationNumber], this.numberArray.getElementById(indentationNumber));
    System.out.println("End testElementById()");
  }

  public void testPutElement() {
    System.out.println("Begin testPutElement()");
    Random rand = new Random();
    int newNumber = rand.nextInt(1000);
    this.numberArray.putElement(newNumber);
    assertSame("These 2 numbers should be same.", this.numberArray.numbers[this.numberArray.numbers.length - 1], newNumber);
    System.out.println("End testPutElement()");
  }

  public void testMaxElementIsInArray() {
    System.out.println("Begin testMaxElementIsInArray()");
    int maxElement = this.numberArray.getMaxElement();
    assertTrue("This element shoud inside array.", Arrays.asList(this.numberArray.numbers).contains(maxElement));
    System.out.println("End testMaxElementIsInArray()");
  }
}
