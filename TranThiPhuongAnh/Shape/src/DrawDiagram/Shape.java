package Cau3;

/**
 * lop hinh dang
 * @author Anh Tran
 */
public abstract class Shape extends Diagram {
    //mau sac
    public String color;
    // dung sai
    public boolean filled;
    
    /**
     * Khoi tao mac dinh
     */
    public Shape(){
        color = "yellow";
        filled = true;
    }
    /**
     * khoi tao tham so
     * @param c mau sac
     * @param f dung sai
     */
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    /**
     * tra ve mau sac
     * @return color
     */
    public String getColor(){
        return color;
    }
    /**
     * khoi tao gia tri mau moi
     * @param c 
     */
    public void setColor(String c){
        c = color;
    }
    /**
     * tra ve dung sai
     * @return filled
     */
    public boolean getFilled(){
        return filled;
    }
    /**
     * khoi tao gia tri dung hoac sai moi
     * @param f 
     */
    public void setFilled(boolean f){
        f = filled;
    }
}
