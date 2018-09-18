package Shop.Source;

public class Customer {
	private String name,phonenumber,id;
	public Customer(){
		name = "";
		phonenumber = "";
		id = "";
	}
	
	public Customer(String name, String phonenumber, String id) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}
