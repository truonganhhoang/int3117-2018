import java.util.Scanner;

public class SumPositiveNumberOfArray {
    public static void main(String args[]){
        int array[] = new int[5];
        int sum = 0;

        input(array);
        sum  = calculateSumPositiveNumber(array);
        System.out.println("Tong so duong trong mang la: "+sum);
    }

    public static void input(int array[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 5 phan tu cho mang: ");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

    public static int calculateSumPositiveNumber(int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                sum += array[i];
            }
        }
        return sum;
    }
}
