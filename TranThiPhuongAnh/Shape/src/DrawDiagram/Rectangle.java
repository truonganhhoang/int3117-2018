package Cau3;

/**
 * lop hinh chu nhat
 * @author Anh Tran
 */
public class Rectangle extends Shape {
    //chieu rong
    public double width;
    //chieu dai
    public double length;
    
    /**
     * khoi tao mac dinh
     */
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    /**
     * khoi tao tham so
     * @param w
     * @param l 
     */
    public Rectangle(double w, double l){
        width = w;
        length = l;
    }
    /**
     * khoi tao voi cac tham so cua lop cha
     * @param w chieu rong
     * @param l chieu dai
     * @param c mau sac
     * @param f dung sai
     */
    public Rectangle(double w, double l, String c, boolean f){
        width = w;
        length = l;
        super.color = c;
        super.filled = f;
    }
    /**
     * tra ve chieu rong
     * @return width
     */
    public double getWidth(){
        return width;
    }
    /**
     * khoi tao gia tri moi cho chieu rong
     * @param w chieu rong
     */
    public void setWidth(double w){
        w = width;
    }
    /**
     * tra ve chieu dai
     * @return length
     */
    public double getLength(){
        return length;
    }
    /**
     * khoi tao gia tri moi cho chieu dai
     * @param l chieu dai 
     */
    public void setLength(double l){
        l = length;
    }
    /**
     * Tinh dien tich hinh chu nhat
     * @return 
     */
    public double getArea(){
        return width*length;
    }
    /**
     * tinh chu vi hinh chu nhat
     * @return 
     */
    public double getPerimeter(){
        return 2*(width + length);
    }
    
    @Override
    /**
     * tra ve toan bo 
     * @return cn
     */
    public String toString(){
        String cn;
        cn = "hinh tron chieu dai va chieu rong " + getWidth() + " , " + getLength() + " co dien tich vs chu vi la "
                + getArea() + " va " + getPerimeter();
        return cn;
    }
}
