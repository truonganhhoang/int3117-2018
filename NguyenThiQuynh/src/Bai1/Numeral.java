package Bai1;

/**
 * Lớp này biểu diễn các số
 * @author Quynh
 */
public class Numeral extends Expression{
    // Khai báo giá trị
    private int value;
    
    /**
     * Hàm khởi tạo có tham số _value
     * @param _value tham số truyền vào hàm
     */
    public Numeral(int _value)
    {
        value = _value;
    }
    
    /**
     * Hàm khởi tạo không tham số
     */
    public Numeral()
    {
        this.value = value;
    }

    @Override
    public String toString() {
        String numeral =  Integer.toString(value);
        return numeral;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
