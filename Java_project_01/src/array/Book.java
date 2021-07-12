package array;

public class Book {
 
	private String bookName;
	private String author;
	
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName (String bookName) {
		this.bookName = bookName;
	}

	public String getauthor() {
		
		return author;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}
	
}
