package snippet;

public class Snippet {
	/**
	Chương trình 1
	Đếm số kí tự l,L
	*/
	
	public int countString(String text) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i)=='l') {
				count ++ ;
			}
			else if (text.charAt(i)=='L' ) {
				count = count + 2;
			}
		}
	
		return  count;
	}
	
	
	
	/**
	 Hàm kiểm tra 1 có phải là tam giác không. Nếu có là loại tam giác gì?
	
	*/
	public int CheckTriangle(int a, int b, int c){
		
		boolean isTriangle = false;
		
			if(a<b+c && b<a+c && c<a+b)
				isTriangle=true;
			
			if(isTriangle){
			if( a==b && b==c)
				return 2;//tam giác đều
			
			else if(a!=b && a!=c &&b!=c) {
				if((a*a == b*b + c*c) ||( b*b == a*a + c*c) || (c*c == a*a + b*b) )
					return 3;//tam giác vuông
				
				else return 0;//tam giác thường
				
			}
			
			else
				return 1;//tam giác cân
			
			}
			
			return -1;//không phải tam giác
		}
	

	
}

