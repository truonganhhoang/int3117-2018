import java.util.*;
public class MyMath {
  public static boolean isPrime(int number) {
    if (number >= 2) {
      if (number % 2 == 0) {
        if (number == 2)
	  return true;
	} 
	else {
	  int max = (int) Math.sqrt((double) number);
	  for (int i = 3; i <= max; i += 2) {
	    if (number % i == 0)
	      return false;
	   }
	   return true;
	} 
     }
     return false;
  }
}
