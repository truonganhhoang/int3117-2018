package vending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private Inventory<Coin> cashInventory = new Inventory<Coin>();
    private Inventory<Item> itemInventory = new Inventory<Item>();
    private long totalSales;
    private Item currentItem;
    private long currentBalance;
    
    public long getBalance() {
    	return this.currentBalance;
    }
    
    public Inventory<Coin> getCashInventory() {
    	return this.cashInventory;
    }
    public VendingMachineImpl() {
        initialize();
    }

    private void initialize() {
        //initialize machine with 5 coins of each denomination
        //and 5 cans of each Item
        for (Coin c : Coin.values()) {
            cashInventory.put(c, 5);
        }

        for (Item i : Item.values()) {
            itemInventory.put(i, 5);
        }

    }
    
    /*
        Select item and get it's value
     */
    public long selectItemAndGetPrice(Item item) {
        if (itemInventory.hasItem(item)) {
            currentItem = item;
            return currentItem.getPrice();
        }
        throw new SoldOutException("Sold Out, Please buy another item");
    }
   
   /*
        Add coin to vending machine
    */
    public void insertCoin(Coin coin) {
        currentBalance = currentBalance + coin.getDenomination();
        cashInventory.add(coin);
    }
    
    /*
        Return bucket with item want buy and coin
     */
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        Item item = collectItem();
        totalSales = totalSales + currentItem.getPrice();

        List<Coin> change = collectChange();

        return new Bucket<Item, List<Coin>>(item, change);
    }

    /*
        Return item want to buy
        Check if coin is enoudh to buy
     */
    private Item collectItem() throws NotSufficientChangeException,
            NotFullPaidException {
        if (isFullPaid()) {
            if (hasSufficientChange()) {
                itemInventory.deduct(currentItem);
                return currentItem;
            }
            throw new NotSufficientChangeException("Not Sufficient change in Inventory");

        }
        long remainingBalance = currentItem.getPrice() - currentBalance;
        throw new NotFullPaidException("Price not full paid, remaining : ", remainingBalance);
    }

    /*
        Return coin payback
     */
    private List<Coin> collectChange() {
        long changeAmount = currentBalance - currentItem.getPrice();
        List<Coin> change = getChange(changeAmount);
        updateCashInventory(change);
        currentBalance = 0;
        currentItem = null;
        return change;
    }

    /*
        return list coin will refund
     */
    public List<Coin> refund() {
        List<Coin> refund = getChange(currentBalance);
        updateCashInventory(refund);
        currentBalance = 0;
        currentItem = null;
        return refund;
    }

    /*
        Check full paid after put coin
     */
    private boolean isFullPaid() {
        if (currentBalance >= currentItem.getPrice()) {
            return true;
        }
        return false;
    }

    /*
        Get list coin change with amount in
     */
    private List<Coin> getChange(long amount) throws NotSufficientChangeException {

        List<Coin> changes = Collections.EMPTY_LIST;

        if (amount > 0) {
            changes = new ArrayList<Coin>();
            long balance = amount;
            while (balance > 0) {
                if (balance >= Coin.TWENTYFIVE.getDenomination()
                        && cashInventory.hasItem(Coin.TWENTYFIVE)) {
                    changes.add(Coin.TWENTYFIVE);
                    balance = balance - Coin.TWENTYFIVE.getDenomination();
                    continue;

                } else if (balance >= Coin.TEN.getDenomination()
                        && cashInventory.hasItem(Coin.TEN)) {
                    changes.add(Coin.TEN);
                    balance = balance - Coin.TEN.getDenomination();
                    continue;

                } else if (balance >= Coin.FIVE.getDenomination()
                        && cashInventory.hasItem(Coin.FIVE)) {
                    changes.add(Coin.FIVE);
                    balance = balance - Coin.FIVE.getDenomination();
                    continue;

                } else if (balance >= Coin.ONE.getDenomination()
                        && cashInventory.hasItem(Coin.ONE)) {
                    changes.add(Coin.ONE);
                    balance = balance - Coin.ONE.getDenomination();
                    continue;

                } else {
                    throw new NotSufficientChangeException("NotSufficientChange, Please try another product ");
                }
            }
        }

        return changes;
    }

    /*
        Reset vending machine
    */
    public void reset() {
        cashInventory.clear();
        itemInventory.clear();
        totalSales = 0;
        currentItem = null;
        currentBalance = 0;
    }

    /*
        Print stats in vending machine
     */
    public void printStats() {
        System.out.println("Total Sales : " + totalSales);
        System.out.println("Current Item Inventory : " + itemInventory);
        System.out.println("Current Cash Inventory : " + cashInventory);
    }

    /*
        Check if has sufficient to buy item
     */
    private boolean hasSufficientChange() {
        return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
    }

    /*
        Check if vending can payback
     */
    private boolean hasSufficientChangeForAmount(long amount) {
        boolean hasChange = true;
        try {
            getChange(amount);
        } catch (NotSufficientChangeException nsce) {
            return hasChange = false;
        }

        return hasChange;
    }

    /*
        Update cash in inventory with list coin in
     */
    private void updateCashInventory(List<Coin> change) {
        for (Coin c : change) {
            cashInventory.deduct(c);
        }
    }

    public long getTotalSales() {
        return totalSales;
    }

}


