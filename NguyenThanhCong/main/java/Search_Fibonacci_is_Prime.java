import java.util.Scanner; 
public class Search_Fibonanci_Is_Prime { 

//Ham kiem tra so nguyen to
  public static boolean checkSNT(int n){ 
    if(n > 1){
      for(int i = 2; i <= Math.sqrt(n); i++){ 
             if(n % i == 0) return false;
      }
      return true;
    }
    else return false;
  }

  public void searchFibonanci(int[] f, int n){
    f[0] = 1; 
    f[1] = 1;
    int i = 1; count = 1;
    while(f[i] < n){
      if(checkSNT( f[i] )){
        System.out.print(" " + f[i]); 
        count++;
      } i++;
      f[i] = f[i-1] + f[i-2];
    } 
  }

  public static void main(String[] args) { 
    Scanner c = new Scanner(System.in);
    int n;
    System.out.println("Nhap n: ");
    n = c.nextInt();
    int[] f = new int[20];
    f[2] = 2; 
    System.out.print("Cac so Fibonanci nho hon "+ n +" la so nguyen to: \n "); 
      searchFibonanci(f,n);
   }
}
