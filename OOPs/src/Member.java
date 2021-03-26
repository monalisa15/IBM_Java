
public class Member {
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	private int mid;
	private String name;
	private Book book;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void status()
	{
		if(book == null)
			System.out.println(name +" has not issued any book");
		else
			System.out.println(name +" has issued" + book.getTitle());
	}
	public Member() {}
	public Member(int mid, String name)
	{
		this.mid = mid;
		this.name = name;
	}
}
