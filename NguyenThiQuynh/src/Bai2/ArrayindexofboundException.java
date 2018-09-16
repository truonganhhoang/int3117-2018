package Bai2;
/**
 * Lớp này để kiểm tra lỗi ArrayIndexOfBoundException
 * @author Quynh
 */
public class ArrayindexofboundException {
    /**
     * Hàm này dùng để chạy chương trình
     * @param args
     * @throws ArrayIndexOutOfBoundsException 
     */
    public static void main (String[] args) throws ArrayIndexOutOfBoundsException
    {
        try{
            String[] number = new String[]{"1", "2", "3", "4", "5"};
            System.out.println(number[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Vuot qua mang cho phep");
        }
    }
}
