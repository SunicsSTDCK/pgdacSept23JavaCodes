package newPack;

public class Library {

	String bTitle;
	int bId;
	String author;
	float price;
	public Library(String bTitle, int bId, String author, float price) {
		super();
		this.bTitle = bTitle;
		this.bId = bId;
		this.author = author;
		this.price = price;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public static void main(String s[])
	{
		Library l1=new Library("Safe Heaven", 1,"Nicholas Sparks",100.5f );
		l1.setbId(3);
		System.out.println("Book details "+l1.getbTitle()+"  "+l1.getAuthor());
	}
}
