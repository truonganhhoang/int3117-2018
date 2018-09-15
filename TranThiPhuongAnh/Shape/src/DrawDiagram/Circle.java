package Cau3;

/**
 * lop hinh tron
 * @author Anh Tran
 */
public class Circle extends Shape {
    //ban kinh
    public double radius;
    //pi
    public double pi;
    
    /**
     * khoi tao mac dinh
     */
    public Circle(){
        super();
        radius = 1.0;
        pi = 3.14;
    }
    /**
     * Khoi tao tam so
     * @param r ban kinh
     */
    public Circle(double r){
        radius = r;
    }
    /**
     * khoi tao voi cac tham so cua lop cha
     * @param r ban kinh
     * @param c mau sac
     * @param f dung sai
     */
    public Circle(double r, String c, boolean f){
        radius = r;
        super.color = c;
        super.filled = f;
    }
    /**
     * tra ve ban kinh
     * @return radius
     */
    public double getRadius(){
        return radius;
    }
    /**
     * khoi tao gia tri moi cho ban kinh
     * @param r 
     */
    public void setRadius(double r){
        r = radius;
    }
    /**
     * Tinh dien tich hinh tron
     * @return 
     */
    public double getArea(){
        return pi*radius*radius;
    }
    /**
     * tinh chu vi hinh tron
     * @return 
     */
    public double getPerimeter(){
        return 2*pi*radius;
    }
    
    /**
     * tra ve toan bo 
     * @return c
     */
    public String toString(){
        String c;
        c = "hinh tron ban kinh " + getRadius() + " co dien tich vs chu vi la "
                + getArea() + " va " + getPerimeter();
        return c;
    }
}
