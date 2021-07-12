package chapter05;

public class Author {

	
		String title;
		String author;
		
		public Author(String t) {
			title = t;
			author = "작자미상";
			
		}
		public Author(String t, String a) {
			title = t;
			author = a;
			
		}
		
		
		
		public static void main(String[] args) {
			
			Author littlePrince = new Author("어린왕자", "생택쥐페리");
			Author loveStory = new Author("춘향전");
			System.out.println(littlePrince.title +" " + littlePrince.author);
			System.out.println(loveStory.title +" " + loveStory.author);
	
	}

}
