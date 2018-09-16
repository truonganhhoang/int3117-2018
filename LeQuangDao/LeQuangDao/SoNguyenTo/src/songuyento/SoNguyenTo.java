
package songuyento;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author DaoLQ
 */
public class SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoNguyenTo test=new SoNguyenTo();
        System.out.print("nhap so x :");
        Scanner sc = new Scanner(System.in);
        int x;
        x=sc.nextInt();
        System.out.println(test.SNT(x));
    }
    
    public boolean SNT(int x){
        if ((x==2) || (x==3)) return true;
        for(int i=2;i<=sqrt(x);i++){
           if (x%i==0) return false; 
        }
        return true;
    }
}
