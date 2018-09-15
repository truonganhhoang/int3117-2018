package Cau3;

/**
 * lop hinh tam giac
 * @author Anh Tran
 */
public class Triangle extends Shape {
    //canh 1
    public double canh1;
    //canh 2
    public double canh2;
    //canh 3
    public double canh3;
    
    /**
     * khoi tao mac dinh
     */
    public Triangle(){
        super();
        canh1 = 1.0;
        canh2 = 1.0;
        canh3 = 1.0;
    }
    /**
     * Khoi tao tham so
     * @param c1 canh1
     * @param c2 canh2
     * @param c3 canh3
     * @param c corlor
     * @param f filled
     */
    public Triangle(double c1, double c2, double c3, String c, boolean f){
        canh1 = c1;
        canh2 = c2;
        canh3 = c3;
        super.color = c;
        super.filled = f;
    }
    /**
     * tra ve chieu dai canh 1
     * @return 
     */
    public double getC1(){
        return canh1;
    }
    /**
     * khoi tao canh thu 1 moi
     */
    public void setC1(){
        this.canh1 = canh1;
    }
    /**
     * tra ve chieu dai canh 2
     * @return 
     */
    public double getC2(){
        return canh2;
    }
    /**
     * khoi tao canh thu 2 moi
     */
    public void setC2(){
        this.canh2 = canh2;
    }
    /**
     * tra ve chieu dai canh 3
     * @return 
     */
    public double getC3(){
        return canh3;
    }
    /**
     * khoi tao canh thu 3 moi
     */
    public void setC3(){
        this.canh3 = canh3;
    }
    /**
     * tinh chu vi tam giac
     * @return 
     */
    public double getPerimeter(){
        return canh1+canh2+canh3;
    }
    
    /**
     * tra ve toan bo
     * @return tg
     */
    @Override
    public String toString(){
        String tg;
        tg = "Hinh tam giac co chieu dai canh lan luot la " + getC1() + " , "
                + getC2() + " , " + getC3() + " va co chu vi la " + getPerimeter();
        return tg;
    }
}
