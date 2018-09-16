import java.util.*;

public class NumberArray {
  public int[] numbers;

  public NumberArray() {
    this.numbers = new int[0];
  }

  public void putElement(int num) {
    int newLength = this.numbers.length;
    this.numbers = Arrays.copyOf(this.numbers, newLength);
    this.numbers[newLength] = num;
  }

  public int getElementById(int id) {
    return this.numbers[id - 1];
  }

  public int getMaxElement() {
    int maxElement = this.numbers[0];
    for(int i = 1; i < this.numbers.length; i++) {
      if(maxElement < this.numbers[i]) {
        maxElement = this.numbers[i];
      }
    }
    return maxElement;
  }

}
