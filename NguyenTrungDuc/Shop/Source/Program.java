package Shop.Source;

import java.util.ArrayList;

public class Program {
	private ArrayList<Bill> bills;
	public Program(){
		bills = new ArrayList<Bill>();
	}
	public void addBill(Bill bill){
		bills.add(bill);
	}
	public void getBills(){
		System.out.println("danh sach hoa don");
		if(bills.size()==0){
			System.out.println("khong co hoa don nao");
		}
		else{
			for(int i = 0 ; i< bills.size();i++){
				System.out.println(bills.get(i).toString());
			}
		}
	}
	public String getBiggestCustomer(){
		String id = "";
		int max = 0;
		ArrayList<String> id_list = new ArrayList<String>();
		for(int i = 0; i < bills.size() ; i ++ ){
			if(id_list.contains(bills.get(i).getCustomer().getId())) continue;
			else{
				String id_tmp = bills.get(i).getCustomer().getId();
				int max_tmp = 0;
				for(int j = i; j<bills.size();j++){
					if(bills.get(j).getCustomer().getId() == id_tmp){
						max_tmp += bills.get(i).getTotalGood();
					}
				}
				if(max_tmp > max){
					max = max_tmp;
					id = id_tmp;
				}
				id_list.add(id_tmp);
			}
		}
		return id;
	}
	
	public void calculateEachTypePrice(){
		System.out.println("Sumary value of each type of good");
		int priceBook = 0, priceCassetTape = 0, priceCD = 0 ;
		for(int i = 0; i <bills.size();i++){
			priceBook+= bills.get(i).calculateTypePrice("Book");
			priceCassetTape += bills.get(i).calculateTypePrice("CassetTape");
			priceCD += bills.get(i).calculateTypePrice("CD");
		}
		
		System.out.println("value of book : "+ priceBook + "\n" + "value of CD : "+ priceCD + "\n" + "value of CassetTape : "+ priceCassetTape + "\n");
		
	}
}
