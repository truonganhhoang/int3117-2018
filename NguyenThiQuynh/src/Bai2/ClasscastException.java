package Bai2;
/**
 * Lớp này để kiểm tra lỗi ClassCastException
 * @author Quynh
 */
public class ClasscastException {
    /**
     * Hàm này dùng để chạy chương trình
     * @param args
     * @throws ClassCastException 
     */
    public static void main (String[] args) throws ClassCastException
    {
        try
        {
            Object obj = new String();
            Integer i;
            i = (Integer) obj;
            System.out.println(i);
        }
        catch(ClassCastException e)
        {
            System.out.println("Class cast exception");
        }
    }
}
