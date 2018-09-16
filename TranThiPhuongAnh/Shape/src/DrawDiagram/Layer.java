package Cau3;

import java.util.ArrayList;

/**
 * lop nhieu doi tuong
 * @author Anh Tran
 */
public class Layer extends Diagram{
    //dung sai
    public boolean visible;
    
    /**
     * tra ve gia tri cua visible
     * @return visible
     */
    public boolean getVisible(){
        return visible;
    }
    /**
     * Khoi tao gia tri moi cua visible
     */
    public void setVisible(){
        this.visible = visible;
    }
    
    /**
     * khoi tao mac dinh
     */
    public Layer(){
        visible = true;
    }
    //tao danh sach Shape
    ArrayList<Shape> listShape = new ArrayList<>();
    
    /**
     * Ham xoa tat ca cac hinh tam giac khoi danh sach Shape
     */
    public void eraseTriangleOfShape(){
        for(int i=0 ; i<listShape.size() ; i++){
            if(listShape.get(i) instanceof Triangle){
                listShape.remove(i);
                
            }
        }
    }
    
    /**
     * Ham xoa tat ca cac hinh tron khoi danh sach Shape
     */
    public void eraseCircleOfShape(){
        for(int i=0; i<listShape.size() ; i++){
            if(listShape.get(i) instanceof Circle){
                listShape.remove(i);
                
            }
        }
    }
    
    /**
     * Ham xoa tat ca cac hinh co trong Layer
     */
    public void eraseShapeOfLayer(){
        for(int i=0; i<listShape.size() ; i++){
            if(listShape.get(i) instanceof Shape){
                listShape.remove(i);
            }
        }
    }
    
    /**
     * Ham xoa cac hinh trung nhau
     */
    public void eraseSameShape(){
        for(int i=0; i<listShape.size()-1 ; i++){
            for(int j=1; j<listShape.size() ; j++){
                if(listShape.get(i) == listShape.get(j)){
                    listShape.remove(j);
                }
            }
        }
    }
}
