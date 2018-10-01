package Library.Source;

import java.util.ArrayList;
import java.util.Scanner;

public class userinterface implements LibraryInterface {
	Scanner d = new Scanner(System.in);
	public void header(){
		System.out.println("-----------------------------Bai Toan Thu Vien----------------------------");
	}
	private String getString(){
		String tmp = d.nextLine();
		return tmp;
	}
	public ArrayList<Book> loadbook(){
		header();
		String choice = "y";
		ArrayList<Book> newbooks = new ArrayList<Book>();
		while(choice.matches("y")){
			System.out.println("please insert the name of the book");
			String name = getString();
			Book book1 = new Book(0,0,2018,name,"Domino","ANC",false);
			newbooks.add(book1);
			System.out.println("Continue loading?(y/n)");
			choice = getString();
		}
		return newbooks;
	}
	public BookForm createForm(){
		header();
		System.out.println("insert user id");
		int uid = d.nextInt();
		System.out.println("insert bookid");
		int id = d.nextInt();
		d.nextLine();
		BookForm form = new BookForm();
		form.setBookid(id);
		form.setUserid(uid);
		return form;
		
	}
	public void returnBook(){
		header();
		System.out.println("Insert the id of the form");
		int id = d.nextInt();
		System.out.println("Form number " + id+" have been returned");
	}
	public void Quit(){
		header();
		System.out.println("the program end here");
	}
	public int greeting(){
		header();
		System.out.println("wellcome to city library \n    1. Load books \n    2. Create new Get Book Form\n    3. Return Books\n    4. Quit\n What do you want to do?(1|2|3|4)");
		int choice = d.nextInt();
		d.nextLine();
		return choice;
	}
}
