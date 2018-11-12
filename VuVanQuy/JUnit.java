package JUnit;

public class JUnit{
    public static String kiemTraTamGiac( int a, int b, int c){
	
	if( ( a + b ) <= c || ( a + c ) <= b || ( b + c ) <= a ){

		return "Kich thuoc da cho khong phai la 3 canh tam giac";	

	}else{
		if( ( a == b) || ( b == c ) || ( a== c )){

			if(( a == b )&&( b == c) ){

				return "Tam giac deu";

			}else{
				return "Tam giac can";

			}
		}else{
			if( ( ( a * a + b * b ) == ( c * c ) ) || 
				( ( a * a + c * c ) == ( b * b ) )	|| 
				( ( b * b + c * c ) == ( a * a ) ) ){

				return "Tam giac vuong";

			}else{

				return "Tam giac thuong";
			}
		}
	}
}
    
}
