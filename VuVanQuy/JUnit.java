package JUnit;

public class JUnit {
    public int[] sort(int array[]) {
        boolean check = false;

        for (int i = 0; i < array.length - 1; i++) {
            check = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
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
