package Library.Source;

import java.util.ArrayList;


public class Tray {
	private int id,bookid,numberofbook;
	private ArrayList<Book> booklist;
	public Tray(){
		id =0 ;
		bookid= 0;
		numberofbook = 0 ;
		booklist = new ArrayList<Book>();
	}
	
	public Tray(int id, int bookid, int numberofbook, ArrayList<Book> booklist) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.numberofbook = numberofbook;
		this.booklist = booklist;
	}
	
	public int getId() {
		return id;
	}
	public int getBookid() {
		return bookid;
	}
	public int getNumberofbook() {
		return numberofbook;
	}
	public ArrayList<Book> getBooklist() {
		return booklist;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setNumberofbook(int numberofbook) {
		this.numberofbook = numberofbook;
	}
	public void setBooklist(ArrayList<Book> booklist) {
		this.booklist = booklist;
	}
	@Override
	public String toString() {
		return "Tray [id=" + id + ", bookid=" + bookid + ", numberofbook=" + numberofbook + ", "
				+ (booklist != null ? "booklist=" + booklist : "") + "]";
	}
	
	public boolean addBook(Book book){
		if(this.bookid != 0 ){
			if(book.getId() == this.bookid){
				if(numberofbook <5){
					booklist.add(book);
					numberofbook++;
					book.setTrayid(this.id);
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		else{
			booklist.add(book);
			this.bookid = book.getId();
			book.setTrayid(this.id);
			numberofbook++;
			return true;
		}
	}
	
	public boolean isContain(Book book){
		if(booklist.isEmpty()) return false;
		else{
			if(booklist.get(0).equal(book)) return true;
			else return false;
		}
	}
	 
	public boolean isLendable(){
		for(int i = 0 ; i < booklist.size();i++){
			if(!booklist.get(i).isborrow()) return true;
		}
		return false;
	}
	
	public void lend(){
		int i = 0;
		while(booklist.get(i).isborrow()){
			i++;
		}
		booklist.get(i).setborrow();
	}
	public int numberOfAvailableBook(){
		int number = 0; 
		for(int i = 0 ; i < booklist.size();i++){
			if(!booklist.get(i).isborrow()) number ++;
		}
		return number;
	}
	
	public int numberOfUnAvailableBook(){
		int number = 0; 
		for(int i = 0 ; i < booklist.size();i++){
			if(booklist.get(i).isborrow()) number ++;
		}
		return number;
	}
	
}
