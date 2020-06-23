package Main;

public class bookVO {
	private String bookid;
	private String name;
	private String author;
	private String publisher;
	private int year;

	public bookVO(String bookid, String name, String author, String publisher, int year) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
	}

	public bookVO(String bookid) {
		super();
		this.bookid = bookid;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
