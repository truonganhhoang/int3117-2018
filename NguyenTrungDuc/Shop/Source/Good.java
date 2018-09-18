package Shop.Source;

public class Good {
	protected String id,title,publisher,type;
	protected int number,price;
	public Good(){
		id = "";
		title="";
		publisher = "";
		number = 0;
		price = 0;
	}
	public Good(String id, String title, String publisher, int price) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.type ="";
		this.price = price;
	}
	public String getId() {
		return id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}

	public int getPrice() {
		return price;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Good [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (publisher != null ? "publisher=" + publisher + ", " : "") + "type=" + type + ", price=" + price
				+ "]";
	}
	public boolean equal(Good good){
		if(this.id!=good.id) return false;
		else return true;
	}
	
}
