package Bai1;

/**
 * Lớp này dùng để thể hiện biểu thức toán học
 * @author Quynh
 */
public abstract class Expression {
    
    /**
     * Hàm khởi tạo không tham số
     */
    public Expression ()
    {
        
    }
    /**
     * Hàm này để ghi đè phương thức toString
     * @return chuỗi được ghi đè
     */
    @Override
    public abstract String toString();
    
    /**
     * Hàm này để ghi đè phương thức evaluate
     * @return giá trị sau khi được ghi đè
     */
    public abstract int evaluate();
}
