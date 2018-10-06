package Library.Source;

public class BookForm {
	private int id, userid, bookid;
	private String day, status;
	public BookForm(){
		id =0 ; 
		userid = 0 ;
		bookid = 0 ;
		day = "";
		status = "";
	}
	public BookForm(int id, int userid, int bookid, String day, String status) {
		super();
		this.id = id;
		this.userid = userid;
		this.bookid = bookid;
		this.day = day;
		this.status = status;
	}
	@Override
	public String toString() {
		return "BookForm [id=" + id + ", userid=" + userid + ", bookid=" + bookid + ", "
				+ (day != null ? "day=" + day + ", " : "") + (status != null ? "status=" + status : "") + "]";
	}
	public int getId() {
		return id;
	}
	public int getUserid() {
		return userid;
	}
	public int getBookid() {
		return bookid;
	}
	public String getDay() {
		return day;
	}
	public String getStatus() {
		return status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
