package Bai1;

/**
 * Lớp này thể hiện phép toán bình phương
 * @author Quynh
 */
public class Square extends Expression{
    // Khai báo 1 Expression
    private Expression expression;
    
    /**
     * Hàm khởi tạo với tham số _expression
     * @param _expression tham sô truyền vào hàm khởi tạo Square
     */
    public Square(Expression _expression)
    {
        this.expression = _expression;
    }

    @Override
    public String toString() {
        String square = "(" + expression.toString() + ")"+"^2";
        return square;
    }

    @Override
    public int evaluate() {
        int square = expression.evaluate()*expression.evaluate();
        return square;
    }
}
