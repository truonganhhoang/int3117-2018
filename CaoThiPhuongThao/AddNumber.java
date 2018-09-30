public class AddNumber {
    public int add (int a[]){
        int total = 0;
        for (int i = 0; i < a.length; i++){
           if (total < Integer.MAX_VALUE) total += a[i];
        }
        return total;
    }
}