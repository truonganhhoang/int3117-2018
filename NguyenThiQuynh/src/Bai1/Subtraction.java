package Bai1;

/**
 * Lớp này để thực hiện phép trừ biểu thức
 * @author Quynh
 */
public class Subtraction extends BinaryExpression{
    // Khai báo vế trái của biểu thức là 1 Expression
    private Expression left;
    
    // Khai báo vế phải của biểu thức là 1 Expression
    private Expression right;
    
    /**
     * Hàm khởi tạo có tham số
     * @param _left vế trái của biểu thức
     * @param _right vế phải của biểu thức
     */
    public Subtraction(Expression _left, Expression _right)
    {
        left = _left;
        right = _right;
    }

    /**
     * Hàm này ghi đè phương thức của vế trái
     * @return vế trái
     */
    @Override
    public Expression left() {
        return left;
    }

    /**
     * Hàm này ghi đè phương thức của vế phải
     * @return vế phải
     */
    @Override
    public Expression right() {
        return right;
    }

    /**
     * Hàm này ghi đè phương thức toString của biểu thức
     * @return chuỗi biểu thức sau khi được xử lý
     */
    @Override
    public String toString() {
        String subtraction = left.toString() + " - " + right.toString();
        return subtraction;
    }

    /**
     * Hàm này ghi dè phương thức evaluate của biểu thức
     * @return giá trị biểu thức sau khi trừ
     */
    @Override
    public int evaluate() {
        int subtraction = left.evaluate() - right.evaluate();
        return subtraction;
    }
}
