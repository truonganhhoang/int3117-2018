package UCLN;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestUCLN {
  @UCLN
  public void test1() {
    int ucln = UCLN.ucln(40, 20);
    assertEquals(ucln, 20);
  }

  @UCLN
  public void test2() {
    int ucln = UCLN.ucln(27, 12);
    assertEquals(ucln, 3);
  }

  @UCLN
  public void test3() {
    int ucln = UCLN.ucln(17, 15);
    assertEquals(gcd, 1);
  }

  @UCLN
  public void test4() {
    int gcd = UCLN.ucln(17, 0);
    assertEquals(ucln, 0);
  }

  @UCLN
  public void test5() {
    int ucln = UCLN.ucln(2147483647, 13);
    assertEquals(ucln, 1);
  }

  @UCLN
  public void test6() {
    int ucln = UCLN.ucln(2147483646, 13);
    assertEquals(ucln, 1);
  }

  @UCLN
  public void test7() {
    int ucln = UCLN.ucln(2147483648, 13);
    assertEquals(ucln, 1);
  }
}
