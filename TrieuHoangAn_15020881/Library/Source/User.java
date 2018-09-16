package Library.Source;

public class User {
	private int id;
	private String fullname, phonenumber, job, address;
	public User(){
		id =0 ;
		fullname = "";
		phonenumber = "";
		job = "";
		address = "";
	}
	public User(int id, String fullname, String phonenumber, String job, String address) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.phonenumber = phonenumber;
		this.job = job;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", " + (fullname != null ? "fullname=" + fullname + ", " : "")
				+ (phonenumber != null ? "phonenumber=" + phonenumber + ", " : "")
				+ (job != null ? "job=" + job + ", " : "") + (address != null ? "address=" + address : "") + "]";
	}
	public int getId() {
		return id;
	}
	public String getFullname() {
		return fullname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public String getJob() {
		return job;
	}
	public String getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}

	