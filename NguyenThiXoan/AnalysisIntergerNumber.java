import java.util.Scanner; 

public class AnalysisIntergerNumber {
//Ham kiem tra so nguyen to
 public static boolean checkPrimeNumber (int n){
     if (n > 1) {
         for(int i = 2; i <= Math.sqrt(n); i++){ 
             if(n % i == 0) 
                return false;
            }
        return true;
    }
    else 
        return false;
 }
 
 public static int[] analysis (int n) {
     int i = 2; 
     int j = 0;
     int[] result = new int[50];
     while (n > 1){
         if(checkPrimeNumber(i)){
             if( n % i == 0){
                     result[j] = i;
                     j++;
            }
            else i++;
            }
        else i++;
    }
    
    return result;
 }
}

