package object;



class Book{
	int bookNumber;
	String BookTitle;
	
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.BookTitle = bookTitle;
		
	}





	@Override
	public String toString() {
		return BookTitle + ", " + bookNumber;
	}

}



public class ToStringEx {
	
	



	public static void main(String[] args) {

		
		Book book1 = new Book(200, "°³¹Ì");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
	
	
}
	
	
}
