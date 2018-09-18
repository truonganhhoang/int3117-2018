package vending;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    	VendingMachine vm = VendingMachineFactory.createVendingMachine();
    	
    	for (int i = 0; i < 5; i++) {
            vm.selectItemAndGetPrice(Item.COCA);
            vm.insertCoin(Coin.TWENTYFIVE);
            vm.collectItemAndChange();
        }
    	System.out.println(vm.getTotalSales());
    }
}
