package Shop.Source;

public class Main {

	public static void main(String[] args) {
		Program program = new Program();
		//Scanner scanner = new Scanner(System.in);
//		String customer_id,customer_name,customer_phonenumber,day,good_id;
//		System.out.println("Customer'id : ");
//		customer_id = scanner.nextLine();
//		System.out.println("Customer'name : ");
//		customer_name = scanner.nextLine();
//		System.out.println("Customer'phonenumber : ");
//		customer_phonenumber = scanner.nextLine();
//		Customer customer = new Customer(customer_id, customer_name, customer_phonenumber);
//		System.out.println("Date: ");
//		day = scanner.nextLine();
//		String state = "Y";
//		int i = 1;
//		while(state!="n"||state!="N"){
//			System.out.println("Goods "+ i +" :\n ");
//			System.out.println("good's id : ");
//			good_id = scanner.nextLine();
//			i++;
//			System.out.println("keep buying?(y/n)");
//			state = scanner.nextLine();
//		}
		Customer man1 = new Customer("Alex","1727272","1");
		Customer man2 = new Customer("Alex","1727272","1");
		Book book1 = new Book("b1","the book of eli","ABC's publisher",20000,300,"Lex Luthor");
		Book book2 = new Book("b2","the book of eli 2","ABC's publisher",25000,300,"Lex Luthor");
		CassetTape ct1 = new CassetTape("c1t","greatest hits of westlife","Hi-Max publisher",25000,150);
		CassetTape ct2 = new CassetTape("c2t","greatest hits of westlife 2","Hi-Max publisher",25000,150);
		CD c1 = new CD("c1","greatest hits of westlife 2","Hi-Max publisher",25000,150);
		CD c2 = new CD("c2","greatest hits of westlife 2","Hi-Max publisher",25000,150);
		String day1 = "10/1/2018", day2 = "2/1/2018";
		Bill bill1 = new Bill();
		Bill bill2 = new Bill();
		bill1.setDate(day1);
		bill1.setCustomer(man1);
		bill1.insert(ct1);
		bill1.insert(c2);
		bill1.insert(ct2);
		bill1.insert(book1);
		bill1.insert(book2);
		bill2.setDate(day2);
		bill2.setCustomer(man2);
		for(int i = 0 ; i <10; i ++){
			bill2.insert(c1);
		}
		program.addBill(bill1);
		program.addBill(bill2);
		program.getBills();
		System.out.println();
		System.out.println("nguoi mua hang nhieu nhat la: "+program.getBiggestCustomer());
		System.out.println();
		program.calculateEachTypePrice();
	}

}
