package Cau3;

import java.util.ArrayList;

/**
 * Lop so do
 * @author Anh Tran
 */
public abstract class Diagram {

    //tao danh sach Layer
    ArrayList<Layer> listLayer = new ArrayList<>();
    private boolean visible;
    
    /**
     * khoi tao mac dinh
     */
    public Diagram(){
    }
    
    /**
     * Ham xoa tat ca cac hinh tron khoi danh sach Layer
     */
    public void eraseCircleOfLayerInDiagram(){
        for(int i=0; i<listLayer.size() ; i++){
            if(!listLayer.isEmpty()){
                listLayer.get(i).eraseCircleOfShape();
            }
        }
    }
    
    /**
     * Ham k ve cac hinh thuoc Layer khi visible la false
     * @param d 
     */
    public void notDrawShapeOfLayerInDiagram(Diagram d){
        if(d.visible = false){
            for(int i=0; i<listLayer.size() ; i++){
                if(!listLayer.isEmpty()){
                    listLayer.get(i).eraseShapeOfLayer();
                }
            }
        }
    }
    
    /**
     * ham chay chuong trinh
     * @param args 
     */
    public static void main(String[] args){
        //xoa hinh tron
        Layer l = new Layer();
        l.eraseCircleOfShape();
        l.eraseTriangleOfShape();
        
        Diagram d = new Diagram() {};
        d.eraseCircleOfLayerInDiagram();
        
        //hinh tron
        Circle c = new Circle();
        c.radius = 2.0;
        
        
        //hinh chu nhat
        Rectangle r = new Rectangle();
        r.width = 2.0;
        r.length = 3.0;
        
        
        //hinh vuong
        Square s = new Square();
        s.side = 1.0;
        
        //hinh tam giac
        Triangle t = new Triangle();
        t.canh1 = 2.0;
        t.canh2 = 3.0;
        t.canh3 = 2.0;
        
        
        System.out.print(c.toString()+"\n");
        System.out.print(r.toString()+"\n");
        System.out.print(s.toString() + " va dien tich la " + s.getArea() +"\n");
        System.out.print(t.toString()+"\n");
        
        //Diagram e = new Layer();
        d.notDrawShapeOfLayerInDiagram(d);
    }
}
