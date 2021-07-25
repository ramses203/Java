package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book2 implements Comparable<Book2>{
	
	private String name;
	private int price;
	
	public Book2(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int compareTo(Book2 o) {
		return this.name.compareTo(o.name);
	}
}

public class LibraryTest2 {

	public static void main(String[] args) {
		
		List<Book2> bookarray = new ArrayList<>();
		bookarray.add(new Book2("자바", 25000));
		bookarray.add(new Book2("파이썬", 15000));
		bookarray.add(new Book2("안드로이드", 30000));
		Collections.sort(bookarray);
		
		System.out.println("========모든책의 가격의 합============");
		int total = 0;
		for(Book2 b : bookarray) {
			total += b.getPrice();
		}
		System.out.println(total);
		
		System.out.println("=======책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력========");
		for(Book2 b : bookarray) {
			if(b.getPrice() >= 20000) {
				String str = b.getName();
				System.out.println(str);
				
				
				

			}
				
				
			}
			
			
		}
	}

