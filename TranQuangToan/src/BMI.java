/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author banhb
 */
public class BMI {
    public static String BMI(double weight, double height){
        double bmi=weight/(height*height);
        if(bmi<=18.5){
            return "thieu can";
        }else if(18.5<bmi&&bmi<=23){
            return "binh thuong";
        }else if(23<bmi&&bmi<=24.99){
            return "thua can";
        }else{
            return "beo phi";
        }
    }
}
