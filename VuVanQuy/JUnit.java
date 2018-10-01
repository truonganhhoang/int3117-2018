package JUnit;

public class JUnit {
    public int[] sort(int array[]) {
        boolean check = true;

        for (int i = 0; i < array.length ; i++) {
            check = true;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    check = false;
                }
            }
            if (check) {
                return array;
            }
        }
        return array;
    }
}
