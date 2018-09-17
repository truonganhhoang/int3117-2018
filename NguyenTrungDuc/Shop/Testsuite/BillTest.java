package Shop.Testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Shop.Source.Bill;
import Shop.Source.Book;
import Shop.Source.CD;
import Shop.Source.Good;
import junit.framework.TestCase;

public class BillTest extends TestCase {
	Bill bill = new Bill();

	@Test
	public void testGetTotalPriceWithNoGood() {
		assertEquals(0,bill.getTotalPrice(),0.0);
	}
	@Test
	public void testGetTotalPriceWithOneGood() {
		Good tmp = new Good("a","a","a",10000);
		bill.getGoods().add(tmp);
		assertEquals(10000,bill.getTotalPrice(),0.0);
	}
	
	@Test
	public void testGetTotalPriceWithManyGoods() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<5;i ++) {
			bill.getGoods().add(tmp);
		}
		assertEquals(10000*5,bill.getTotalPrice(),0.0);
	}
	
	@Test
	public void testGetTotalPriceWithManyGoodsAndDiscount() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<300;i ++) {
			bill.getGoods().add(tmp);
		}
		assertEquals(true,bill.isIsdiscount());
	}
	
	@Test
	public void testGetTotalPriceWithManyGoodsAndDiscountInRightLimitOfDiscount() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<20;i ++) {
			bill.getGoods().add(tmp);
		}
		assertEquals(false,bill.isIsdiscount());
	}
	
	@Test
	public void testGetTotalGoodWithNoGood() {
		assertEquals(0, bill.getTotalGood());
	}
	
	@Test
	public void testGetTotalGoodWithManyGood() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<20;i ++) {
			bill.getGoods().add(tmp);
		}
		assertEquals(20, bill.getTotalGood());
	}
	
	@Test
	public void testGetTypeWithNoGood() {
		assertEquals(0, bill.calculateTypePrice(""));
	}
	
	@Test
	public void testGetTypeBookPriceWithNoBook() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<20;i ++) {
			bill.getGoods().add(tmp);
		}
		assertEquals(0, bill.calculateTypePrice("Book"));
	}
	
	@Test
	public void testGetTypeBookPriceWithOneBook() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<20;i ++) {
			bill.getGoods().add(tmp);
		}
		Book book = new Book("a","a","a",10000,70,"a");
		bill.getGoods().add(book);
		assertEquals(10000, bill.calculateTypePrice("Book"));
	}
	
	@Test
	public void testGetTypeCDPriceWithOneCD() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<20;i ++) {
			bill.getGoods().add(tmp);
		}
		CD cd = new CD("a","a","a",10000,70);
		bill.getGoods().add(cd);
		assertEquals(10000, bill.calculateTypePrice("CD"));
	}
	
	@Test
	public void testGetTypeCDPriceWithTenCD() {
		Good tmp = new Good("a","a","a",10000);
		for(int i =0 ; i<10;i ++) {
			bill.getGoods().add(tmp);
		}
		CD cd = new CD("a","a","a",10000,70);
		for(int i = 0 ; i < 10;i++) {
			bill.getGoods().add(cd);
		}
		assertEquals(10000*10, bill.calculateTypePrice("CD"));
	}
	public BillTest(String name) {
		super(name);
	}

	@Before
	public void setUp() throws Exception {
	
	}
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
