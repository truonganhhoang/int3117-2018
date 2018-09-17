package Shop.Testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Shop.Source.Bill;
import Shop.Source.Book;
import Shop.Source.CD;
import Shop.Source.CassetTape;
import Shop.Source.Customer;
import Shop.Source.Program;

public class ProgramTest {
	Program program = new Program();
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Customer man1 = new Customer("Alex","1111111","1");
		Customer man2 = new Customer("Sam","2222222","2");
		Book book1 = new Book("b1","the book of eli","ABC's publisher",20000,300,"Lex Luthor");
		Book book2 = new Book("b2","the book of eli 2","ABC's publisher",25000,300,"Lex Luthor");
		CassetTape ct1 = new CassetTape("ct1","greatest hits of westlife","Hi-Max publisher",25000,150);
		CassetTape ct2 = new CassetTape("ct2","greatest hits of westlife 2","Hi-Max publisher",25000,150);
		CD c1 = new CD("c1","greatest hits of westlife 2","Hi-Max publisher",25000,150);
		CD c2 = new CD("c2","greatest hits of westlife 2","Hi-Max publisher",25000,150);
		String day1 = "10/1/2018", day2 = "2/1/2018";
		Bill bill1 = new Bill();
		Bill bill2 = new Bill();
		Bill bill3 = new Bill();
		bill1.setDate(day1);
		bill2.setDate(day2);
		bill1.setCustomer(man1);
		bill2.setCustomer(man2);
		bill3.setCustomer(man2);
		for(int i = 0 ; i < 10; i ++) {
			bill1.getGoods().add(book1);
			bill1.getGoods().add(c2);
		}
		for(int i = 0 ; i < 5; i ++) {
			bill2.getGoods().add(ct1);
			bill2.getGoods().add(c2);
		}
		for(int i = 0 ; i < 15; i ++) {
			bill3.getGoods().add(ct1);
			bill3.getGoods().add(c2);
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBiggestCustomer() {
		assertEquals("2", program.getBiggestCustomer());
	}

}
