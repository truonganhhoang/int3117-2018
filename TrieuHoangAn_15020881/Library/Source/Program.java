package Library.Source;

import java.util.ArrayList;

public class Program {
	private ArrayList<Tray> traylist;
	private ArrayList<BookForm> formlist;
	public Program(){
		traylist = new ArrayList<Tray>();
		formlist = new ArrayList<BookForm>();
	}
	
	public ArrayList<Tray> getTraylist() {
		return traylist;
	}

	public void setTraylist(ArrayList<Tray> traylist) {
		this.traylist = traylist;
	}

	public ArrayList<BookForm> getFormlist() {
		return formlist;
	}

	public void setFormlist(ArrayList<BookForm> formlist) {
		this.formlist = formlist;
	}

	public Program(ArrayList<Tray> traylist, ArrayList<BookForm> formlist) {
		super();
		this.traylist = traylist;
		this.formlist = formlist;
	}
	@Override
	public String toString() {
		return "Program [" + (traylist != null ? "traylist=" + traylist + ", " : "")
				+ (formlist != null ? "formlist=" + formlist : "") + "]";
	}
	public void addForm(BookForm form){
		formlist.add(form);
	}
	public void createGetBookForm(){
		
	}
	public void addTray(Tray tray){
		tray.setId(traylist.size()+1);
		traylist.add(tray);
	}
	
	public void addBook(Book book){
		for(int i = 0; i < traylist.size();i++){
			if(traylist.get(i).getBooklist().get(0).equal(book)) book.setId(traylist.get(i).getBookid());
			if(traylist.get(i).addBook(book)) return;
		}
		
		Tray newtray = new Tray();
		newtray.addBook(book);
		this.addTray(newtray);
	}
	
	public void buyMoreBook(ArrayList<Book> newbooks){
		for(int i = 0 ; i < newbooks.size();i++){
			this.addBook(newbooks.get(i));
		}
	}
	
	public void getInfoThroughID(int id){
		int num_ava =0, num_unava = 0,j =0;
		int[] traypos = new int[100];
		for(int i = 0; i < traylist.size();i++){
			if(traylist.get(i).getBookid()==id){
				num_ava += traylist.get(i).numberOfAvailableBook();
				num_unava += traylist.get(i).numberOfUnAvailableBook(); 
				traypos[j] = i;
				j++;
			}
		}
		System.out.println("So luong sach hien co :"+num_ava+"\nSo luong sach cho thue : "+num_unava);
		System.out.print("Cac o chua sach co id "+id+" la : ");
		for(int i = 0 ; i <= j ;i++){
			System.out.println(traypos[i]+",");
		}
	}
	
	
}
