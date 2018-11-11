package Shop.Source;

import java.util.ArrayList;

public class Bill {
	private Customer customer;
	private boolean isdiscount;
	private ArrayList<Good> goods;
	private String date;
	public Bill(){
		customer = new Customer();
		isdiscount = false;
		goods = new ArrayList<Good>();
		date = "";
	}
	public Bill(Customer customer, ArrayList<Good> goods, String date) {
		super();
		this.customer = customer;
		this.isdiscount = false;
		this.goods = goods;
		this.date = date;
	}
	
	public boolean isIsdiscount() {
		int i = this.getTotalPrice();
		return isdiscount;
	}
	public ArrayList<Good> getGoods() {
		return goods;
	}
	public String getDate() {
		return date;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setIsdiscount(boolean isdiscount) {
		this.isdiscount = isdiscount;
	}
	public void setGoods(ArrayList<Good> goods) {
		this.goods = goods;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void insert(Good good){
		goods.add(good);
	}
	public void delete(Good good){
		goods.remove(good);
	}
	public Customer getCustomer(){
		return this.customer;
	}
	public int getTotalPrice(){
		int value = 0;
		for(int i = 0 ; i< goods.size();i++){
			value+= goods.get(i).getPrice();
		}
		if(value > 200000) {
			value = value*100/85;
			isdiscount = true;
		}
		return value;	
	}
	
	public int calculateTypePrice(String type){
		int value = 0;
		for(int i = 0 ; i < goods.size();i++){
			if(goods.get(i).getType().matches(type)){
				value += goods.get(i).getPrice();
			}
		}
		return value;
	}
	@Override
	public String toString(){
		String result = "";
		String discount = "";
		if(isdiscount){
			discount ="15%";
		}
		else discount = "0%";
		result += "sell date : "+ date + "\n" + "discount : " + discount +"\n"+"Customer Name : " 
		+ customer.getName() + "\n" + customer.getPhonenumber() + "\n";
		for(int i = 0 ; i < goods.size();i++){
			result += goods.get(i).toString() + "\n";
		}
		result+= this.getTotalPrice();
		return result;
	}
	public int getTotalGood(){
		return goods.size();
	}
}
