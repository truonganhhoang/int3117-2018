package PKDM;

public class DemoTest {
	public int dem(String n) {
		int count =0;
		for(int i=0;i<n.length();i++) {
			if(n.charAT(i) == 'a' || n.charAT(i) == 'A') {
				count ++;
			}
		}
		return count;
		
		
	}
}
