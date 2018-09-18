package Bai1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Lớp này để kiểm tra kết quả từ lớp Expression
 * @author quynh
 */
public class ExpressionTest {
    @Test
    public void ExpressionTest()
    {
        Expression num1 = new Numeral(10);
        Expression num2 = new Numeral(1);
        Expression num3 = new Numeral(2);
        Expression num4 = new Numeral(3);
        
        Square square1 = new Square(num1);
        int a = square1.evaluate();
        
        Expression num5 = new Numeral(a);
        Subtraction sub1 = new Subtraction(num5, num2);
        
        Multiplication mul1 = new Multiplication(num3, num4);
        Addition add2 = new Addition(sub1, mul1);
        
        Square square2 = new Square(add2);
        int kq = square2.evaluate();
        
        int results = 11025;
        
        assertEquals(results, kq);
    }
    
    public static void main (String[] arrgs) throws ArithmeticException
    {
        try
        {
            Expression a = new Numeral(10);
            Expression b = new Numeral(0);
            Division di1 = new Division(a, b);
            
            int c = di1.evaluate();
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Loi chia cho 0");
        }
    }
}
