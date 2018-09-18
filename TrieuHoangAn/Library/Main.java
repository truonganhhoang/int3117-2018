package Library;

import Library.Source.LibraryInterface;
import Library.Source.Program;

//import java.util.Scanner;

public class Main {
	private static Program mainprogram = new Program();
 //	private static Scanner d = new Scanner(System.in);
	
	static private LibraryInterface GUI;
	public static void main(String[] args) {
		//userinterface GUI = new userinterface();
		
		int choice = 0;
		choice = GUI.greeting();
		while(choice!=4){
			switch (choice){
				case 1: {
					mainprogram.buyMoreBook(GUI.loadbook());
				}
					break;
				case 2: mainprogram.addForm(GUI.createForm()); 
					break;
				case 3: GUI.returnBook();
					break;
			}
			choice = GUI.greeting();
		}
		GUI.Quit();
	}

}
