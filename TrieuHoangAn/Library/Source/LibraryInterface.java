package Library.Source;

import java.util.ArrayList;

public interface LibraryInterface {
	public int greeting();
	public void header();
	public ArrayList<Book> loadbook();
	public void returnBook();
	public void Quit();
	public BookForm createForm();
}
