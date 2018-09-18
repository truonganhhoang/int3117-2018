package Library.Source;

public class Main {
	private static LibraryInterface gui = new userinterface();
	public static void main(String[] args) {
		Program program = new Program();
		int i = 0;
		while(i!=4) {
			i = gui.greeting();
			switch(i) {
				case 1:{ gui.loadbook();
					break;
				}
				
				case 2: {
					gui.createForm();
					break;
					}
				case 3: gui.returnBook();
					break;
				case 4: break;	
			}
		}
	}

}
