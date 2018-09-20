import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MyMathTest {
  private int number;
  private boolean prime;
	
  public MyMathTest(Integer number, Boolean prime) {
    this.number = number.intValue();
    this.prime = prime.booleanValue();
  } 

  @Parameterized.Parameters
  public static List<Object[]> testParam() {
  return Arrays.asList(new Object[][] {
    { -65536, false },
    { -21, false },
    { -2, false },
    { -1, false },
    { 0, false },
    { 1, false },
    { 2, true },
    { 3, true },
    { 4, false },
    { 17, true },
    { 21, false },
    { 40, false },
    { 289, false },
    { 65536, false },
    { 65538, false }
    });
    }

  @Test
  public void testPrime() {
  assertEquals("The input number is " + number + " and isPrime method should return "
  + prime + "but it return" + MyMath.isPrime(number), prime, MyMath.isPrime(number));
  }
}
