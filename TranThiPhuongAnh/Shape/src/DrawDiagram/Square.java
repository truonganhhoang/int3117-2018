package Cau3;

/**
 * Lop hinh vuong
 * @author Anh Tran
 */
public class Square extends Rectangle {
    //canh
    public double side;
    
    /**
     * khoi tao mac dinh
     */
    public Square(){
        super();
        side = 1.0;
    }
    /**
     * khoi tao tham so
     * @param s canh
     */
    public Square(double s){
        side = s;
    }
    /**
     * khoi tao tham so tu lop cha
     * @param s canh
     * @param c mau sac
     * @param f dung sai
     */
    public Square(double s, String c, boolean f){
        side = s;
        super.color = c;
        super.filled = f;
    }
    /**
     * tra ve canh
     * @return side
     */
    public double getSide(){
        return side;
    }
    /**
     * khoi tao gia tri canh moi
     * @param s canh
     */
    public void setSide(double s){
        s = side;
    }
    /**
     * khoi tao gia tri canh bang voi chieu rong
     * @param s canh
     */
    public void setWith(double s){
        s = width;
    }
    /**
     * Khoi tap gia tri canh bang chieu dai
     * @param s canh
     */
    public void setLength(double s){
        s = length;
    }
    
    @Override
    /**
     * tra ve hinh vuong
     * @return v
     */
    public String toString(){
        String v;
        v = "Hinh vuong co canh " + getSide();
        return v;
    }
}
