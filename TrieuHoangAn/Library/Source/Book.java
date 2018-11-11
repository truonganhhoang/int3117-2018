package Library.Source;

public class Book {
	private int id, tray_id, produceYear;
	private String author, publisher,name;
	private boolean isborrow;
	public Book(){
		id = 0; 
		tray_id = 0;
		produceYear = 0;
		name="";
		author = "";
		publisher = "";
		isborrow = false;
	}
	public Book(int id, int tray_id, int produceYear,String name, String author, String publisher, boolean isborrow) {
		super();
		this.id = id;
		this.name = name;
		this.tray_id = tray_id;
		this.produceYear = produceYear;
		this.author = author;
		this.publisher = publisher;
		this.isborrow = isborrow;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", tray_id=" + tray_id + ", produceYear=" + produceYear + ", "
				+ (author != null ? "author=" + author + ", " : "")
				+ (publisher != null ? "publisher=" + publisher + ", " : "") + "isborrow=" + isborrow + "]";
	}
	public int getId() {
		return id;
	}
	public int getTray_id() {
		return tray_id;
	}
	public int getProduceYear() {
		return produceYear;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public boolean isborrow() {
		return isborrow;
	}
	public void setborrow(){
		isborrow = true;
	}
	public void returnbook(){
		isborrow = false;
	}
	public void setTrayid(int trayid){
		this.tray_id = trayid;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equal(Book book){
		if(this.getAuthor()==book.getAuthor()&&this.getProduceYear()==book.getProduceYear()&&this.getPublisher() == book.getPublisher()&&this.getName()==book.getName())
			return true;
		else return false;
	}
}
