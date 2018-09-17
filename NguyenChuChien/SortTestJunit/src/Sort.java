public class Sort {
	//Bubble Sort
	public int[] bubbleSort (int[]array) {
		int temp =  0 ;  
	    for (int i=0; i<array.length-1; i++) {  
	        for (int j=0; j<array.length-1-i; j++) {  
	            if  (array[j]>array[j+1]) {  
	                temp = array[j];  
	                array[j] = array [j + 1];  
	                array[j+1] = temp;  
	            }  
	        }  
	    }
	    return array;
	}
	
	//Quick Sort
	private static int getMiddle(int[] list, int low, int high) {  
	    int tmp = list[low];    
	    while (low<high) {  
	        while (low<high && list[high]>=tmp) {  
	            high--;  
	        }    
	        list[low] = list[high];   
	        while (low < high && list[low] <= tmp) {  
	            low++;  
	        }  
	        list[high] = list[low];   
	    }  
	    list[low] = tmp;              
	    return low;                  
	}
	
	public int[] quickSort (int[] list, int low, int high) {
	    if (low<high) {
	    	int middle = getMiddle(list, low, high);  
	        quickSort(list, low, middle - 1);      
	        quickSort(list, middle + 1, high);
	    }
	    return list;
	}
	
	//Insert Sort
	public int[]  insertSort (int[] array) {    
	     for  (int i=1; i<array.length; i++) {  
	         int  temp = array[i];  
	         int  j=i-1 ;  
	         for  (; j>=0  && array[j]>temp; j--) {  
	             // Moves the value greater than temp back by one unit  
	             array[j+1] = array[j];  
	         }  
	         array[j+1] = temp;  
	     }  
	     return array;  
	 }  
	
	public static void main(String[] args) { 
		
	}
	
}
