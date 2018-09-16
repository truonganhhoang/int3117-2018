package Bai2;

/**
 * Lớp này để test lỗi Arithmeticexception
 * @author Quynh
 */
public class Arithmeticexception {
    public static void main (String[] args)
    {
        try{
            int a = 1;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("so chia phai khac 0");
        }
    }
}
