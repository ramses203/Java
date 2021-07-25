package lambda;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	
	
}


public class LibraryTest {

	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		System.out.println("========���å�� ������ ��============");
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		System.out.println("=======å�� ������ 20,000�� �̻��� å�� �̸��� �����Ͽ� ���========");
		bookList.stream().filter(c -> c.getPrice() >= 20000).map(s -> s.getName()).sorted().forEach(a -> System.out.println(a));
	}
	
}
