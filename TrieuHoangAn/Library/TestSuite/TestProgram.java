package Library.TestSuite;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Library.Source.Book;
import Library.Source.Program;
import Library.Source.Tray;

public class TestProgram {
	Program program = new Program();
	

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testBuyBookMethodWithNoBooksInside() {
		Book book = new Book();
		ArrayList<Book> books = new ArrayList<Book>();
		for(int i = 0; i < 10; i ++) {
			books.add(book);
		}
		program.buyMoreBook(books);
		assertEquals(2,program.getTraylist().size());
		
	}

	@Test
	public void testBuyBookMethodWithFiveBooksInside() {
		Book book = new Book();
		
		ArrayList<Tray> trays = new ArrayList<Tray>();
		program.setTraylist(trays);
		for(int i = 0; i < 5; i ++) {
			program.addBook(book);
		}
		ArrayList<Book> books = new ArrayList<Book>();
		for(int i = 0; i < 10; i ++) {
			books.add(book);
		}
		program.buyMoreBook(books);
		assertEquals(3,program.getTraylist().size());
		
	}
	@Test
	public void testBuyThreeBookMethodWithOneBooksInside() {
		Book book = new Book();
		
		ArrayList<Tray> trays = new ArrayList<Tray>();
		program.setTraylist(trays);
		for(int i = 0; i < 3; i ++) {
			program.addBook(book);
		}
		ArrayList<Book> books = new ArrayList<Book>();
		for(int i = 0; i < 1; i ++) {
			books.add(book);
		}
		program.buyMoreBook(books);
		assertEquals(1,program.getTraylist().size());
		
	}
	@Test
	public void testBuySixBookMethodWithNoneBooksInside() {
		Book book = new Book();
		
		ArrayList<Tray> trays = new ArrayList<Tray>();
		program.setTraylist(trays);
		ArrayList<Book> books = new ArrayList<Book>();
		for(int i = 0; i < 6; i ++) {
			books.add(book);
		}
		program.buyMoreBook(books);
		assertEquals(2,program.getTraylist().size());
		
	}
}
