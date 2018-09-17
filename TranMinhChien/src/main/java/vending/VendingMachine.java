package vending;

import java.util.List;

public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);

    public void insertCoin(Coin coin);

    public List<Coin> refund();

    public Bucket<Item, List<Coin>> collectItemAndChange();

    public void reset();
    
    public long getBalance();
    
    public Inventory<Coin> getCashInventory();
    
    public long getTotalSales();
}
