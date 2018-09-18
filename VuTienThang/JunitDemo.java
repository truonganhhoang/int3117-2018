/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.demo;

/**
 *
 * @author thang
 */
public class JunitDemo {

    /**
     * @param args the command line arguments
     */
    public static boolean songuyento(int a){
        if(a > 0){
            int count = 0;
            for(int i = 1; i <= a; i++){
                if(a % i == 0)
                    count++;
            }
            if(count == 2)
                return true;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
    }
}
