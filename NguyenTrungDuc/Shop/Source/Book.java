package Shop.Source;

public class Book extends Good{
	private int pages;
	private String author;
	public Book(){
		super();
		pages = 0;
		author = "";
		type = "Book";
	}
	public Book(String id, String title, String publisher, int price, int pages, String author){
		super(id,title,publisher,price);
		this.pages = pages;
		this.author = author;
		this.type = "Book";
	}
	public int getPages() {
		return pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString(){
		return "Good [" + (id != null ? "id=" + id + ", " : "") + (title != null ? "title=" + title + ", " : "")
				+ (publisher != null ? "publisher=" + publisher + ", " : "") + "type=" + type + ", price=" + price
				+ ", number of pages :"+pages+" , author :"+author+"]";
	}
}
