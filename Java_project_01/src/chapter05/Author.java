package chapter05;

public class Author {

	
		String title;
		String author;
		
		public Author(String t) {
			title = t;
			author = "���ڹ̻�";
			
		}
		public Author(String t, String a) {
			title = t;
			author = a;
			
		}
		
		
		
		public static void main(String[] args) {
			
			Author littlePrince = new Author("�����", "�������丮");
			Author loveStory = new Author("������");
			System.out.println(littlePrince.title +" " + littlePrince.author);
			System.out.println(loveStory.title +" " + loveStory.author);
	
	}

}
