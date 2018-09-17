package UCLN;

public class UCLN {
  public static int UCLN (int a, int b) {
    if (a==0 || b==0)
      return 0;
    while (a != b) {
      if (a > b)
        a = a - b;
      else
        b = b - a;
    }
    return a;
  }
}
