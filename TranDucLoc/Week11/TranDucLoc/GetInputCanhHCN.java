/**
 * Created by LocDZ on 11/8/2018.
 */
import java.util.Scanner;

public class GetInputCanhHCN {
    public GetInputCanhHCN(int i, int i1) {
    }

    static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int x,y = 0;
        try {
            System.out.println("Hãy nhập canh 1: ");
            x = scanIn.nextInt();
            System.out.println("Hãy nhập canh 2: ");
            y = scanIn.nextInt();
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
    static void Dientich(int x, int y){
        if(x<= 0  || y <= 0){
            System.out.println("Day khong phai canh hinh chu nhat");
        }
        else {
            if(x==y){
                int chuvi = x*4;
                int dientich = x*x;
                System.out.println("day la hinh vuong co chu vi la: "+ chuvi + " dien tich la: "+ dientich);

            }
            else{

                int chuvi = x+y;
                int dientich = x*y;
                System.out.println("day la hinh vuong co chu vi la: "+ chuvi + " dien tich la: "+ dientich);


            }
        }
    }
}
