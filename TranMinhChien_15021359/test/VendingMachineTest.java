package tmc.uet.test;

import org.junit.Ignore;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import vending.Bucket;
import vending.Coin;
import vending.Item;
import vending.NotSufficientChangeException;
import vending.SoldOutException;
import vending.VendingMachine;
import vending.VendingMachineFactory;
import vending.VendingMachineImpl;

import static org.junit.Assert.*;


public class VendingMachineTest {
    private static VendingMachine vm;

    @BeforeClass
    public static void setUp() {
        vm = VendingMachineFactory.createVendingMachine();
    }
    
    @Test
    public void testPrice() {
    	vm = VendingMachineFactory.createVendingMachine();
    	long cocaPrice = vm.selectItemAndGetPrice(Item.COCA);
    	assertEquals(Item.COCA.getPrice(), cocaPrice);
    	long pepsiPrice = vm.selectItemAndGetPrice(Item.PEPSI);
    	assertEquals(Item.PEPSI.getPrice(), pepsiPrice);
    	long mirindaPrice = vm.selectItemAndGetPrice(Item.MIRINDA);
    	assertEquals(Item.MIRINDA.getPrice(), mirindaPrice);
    }
    
    @Test
    public void testBuyItemWithExactPrice() {
        long price = vm.selectItemAndGetPrice(Item.COCA);
        vm.insertCoin(Coin.TWENTYFIVE);

        Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange();
        Item item = bucket.getFirst();
        List<Coin> change = bucket.getSecond();
        
        assertEquals(Item.COCA, item);
        assertTrue(change.isEmpty());
    }

    @Test
    public void testBuyItemWithMorePrice() {
        long price = vm.selectItemAndGetPrice(Item.MIRINDA);
        vm.insertCoin(Coin.TWENTYFIVE);
        vm.insertCoin(Coin.TWENTYFIVE);

        Bucket<Item, List<Coin>> bucket = vm.collectItemAndChange();
        Item item = bucket.getFirst();
        List<Coin> change = bucket.getSecond();

        assertEquals(Item.MIRINDA, item);
        assertTrue(!change.isEmpty());
        assertEquals(50 - Item.MIRINDA.getPrice(), getTotal(change));

    }
    
    @Test
    public void testRefund() {
        vm.insertCoin(Coin.TEN);
        vm.insertCoin(Coin.FIVE);
        vm.insertCoin(Coin.ONE);
        vm.insertCoin(Coin.TWENTYFIVE);

        assertEquals(41, getTotal(vm.refund()));
    }
    
    @Test(expected=SoldOutException.class)
    public void testSoldOut(){
    	VendingMachine vm = VendingMachineFactory.createVendingMachine();
        for (int i = 0; i < 6; i++) {
            vm.selectItemAndGetPrice(Item.COCA);
            vm.insertCoin(Coin.TWENTYFIVE);
            vm.collectItemAndChange();
        }
    }
    
    @Test
    public void testTotalSale() {
    	VendingMachine vm = VendingMachineFactory.createVendingMachine();
        for (int i = 0; i < 2; i++) {
            vm.selectItemAndGetPrice(Item.PEPSI);
            vm.insertCoin(Coin.TWENTYFIVE);
            vm.insertCoin(Coin.TWENTYFIVE);
            vm.collectItemAndChange();
        }
        assertEquals(70, vm.getTotalSales());
    }
    
    @Test(expected=SoldOutException.class)
    public void testReset(){
        VendingMachine vmachine = VendingMachineFactory.createVendingMachine();
        vmachine.reset();
        vmachine.selectItemAndGetPrice(Item.MIRINDA);
       
    }

    @Ignore
    public void testVendingMachineImpl() {
        VendingMachineImpl vm = new VendingMachineImpl();
    }

    private long getTotal(List<Coin> change) {
        long total = 0;
        for (Coin c : change) {
            total = total + c.getDenomination();
        }
        return total;
    }
}


