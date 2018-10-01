/**
 * Created by Bit on 9/29/2018.
 */
public class CheckArray {
    // Kiem tra xem mang dua vao toan so duong, toan so am, hay co ca am ca duong
    String checkArray(int arr[])
    {
        int n = arr.length;
        boolean isPositive = false;
        boolean isNegative = false;

        for(int i = 0; i < n; i++)
            if (arr[i] > 0)
                isPositive = true;
            else
                isNegative = true;

        if (isNegative && isPositive)
            return "Mix";
        if (isNegative)
            return "Negative";
        else
            return "Positive";
    }
}
