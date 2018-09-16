package Bai1;

/**
 * Lớp này thể hiện phép toán nhị thức
 * @author Quynh
 */
public abstract class BinaryExpression extends Expression{
    // Biểu diễn biểu thức bên trái
    public abstract Expression left();
    
    // Biểu diễn biểu thức bên phải
    public abstract Expression right();
}
