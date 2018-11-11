package Library.TestSuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Library.Source.Book;
import Library.Source.Tray;

public class TestTray {

	Tray tray = new Tray();
	
	@Test
	public void testAddOneBook() {
		Book book = new Book();
		tray.getBooklist().clear();
		tray.addBook(book);
		assertEquals(1,tray.getNumberofbook());
	}
	
	@Test
	public void testAddSixBook() {
		Book book = new Book();
		tray.getBooklist().clear();
		for(int i = 0 ; i<6;i++) {
			tray.addBook(book);
		}
		assertEquals(5,tray.getNumberofbook());
	}
	
	@Test
	public void testAddMoreThanTwoKindOfBook() {
		Book book = new Book();
		tray.getBooklist().clear();
		for(int i = 0 ; i<6;i++) {
			book.setId(i);
			tray.addBook(book);
		}
		assertEquals(1,tray.getNumberofbook());
	}

	@Test
	public void testLendBook() {
		Book book = new Book();
		tray.getBooklist().clear();
		for(int i = 0 ; i<5;i++) {
			tray.addBook(book);
		}
		assertTrue(tray.isLendable());
	}
	@Test
	public void testLendBookWithOneBook() {
		Book book = new Book();
		tray.getBooklist().clear();
		tray.addBook(book);
		assertTrue(tray.isLendable());
	}
	@Test
	public void testLendBookWithFiveBook() {
		Book book = new Book();
		tray.getBooklist().clear();
		for(int i = 0 ; i<5;i++) {
			tray.addBook(book);
		}
		for(int i = 0 ; i < 4; i ++) {
			tray.lend();
		}
		assertTrue(tray.isLendable());
	}
}
