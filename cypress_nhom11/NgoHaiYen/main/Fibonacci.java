package main;
 public class Fibonacci {
    public static int getFibonacci(int n){
        if (n < 0){
            return 0;
        } else if (n <= 1)
            return n;
        return getFibonacci(n-1) + getFibonacci(n-2);
    }
}