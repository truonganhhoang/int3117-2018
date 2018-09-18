package Shop.Source;

public class CD extends Good {
	private int duration;
	public CD(){
		super();
		duration = 0;
		type = "CD";
	}

	public CD(String id, String title, String publisher, int price,int duration) {
		super(id,title,publisher,price);
		this.duration = duration;
		type = "CD";
	}
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
