/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class inputTriangle {
    public String checkTriangle(int  x, int  y, int z) {
	if (x+y<=z || x+z<=y || y+z<=x || x<=0 || y<=0 || z<=0) 
            return("Not a Triangle");
        else {
		if (x==y && y==z)
			return("equilateral triangle");
	else {
		if (x==y || x==z || y==z)
			return("isosceles triangle");
		else
			return("normal triangle");            
            }
        }
    }
}
