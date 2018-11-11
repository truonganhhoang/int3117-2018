/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package tuan11;

/**
 *
 * @author quan
 */
public class Tuan11  {
    public static String giaiPTBac2(float a, float b, float c)  {
        
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        String str = "";
        
        if (a == 0) {
            str = "a phai khac 0";
        }
        else {
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                str = "Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2 = " + x2;
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                str= "Phuong trinh co nghiem kep " + "x1 = x2 = " + x1;
            } else {
                str = "Phuong trinh vo nghiem!";
            }
        }
        return str;
    }
}

