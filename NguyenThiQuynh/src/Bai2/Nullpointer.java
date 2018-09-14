package Bai2;
import java.lang.NullPointerException;
/**
 * Lớp này xử lý lỗi NullPointer
 * @author Quynh
 */
public class Nullpointer{
    /**
     * Hàm này dùng để chạy chương trình
     * @param args
     * @throws NullPointerException 
     */
    public static void main(String[] args) throws NullPointerException
    {
        try{
            Object obj = null;
            System.out.println("chuoi can tim la: " + obj.toString());
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }
    }
}
