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
		bookarray.add(new Book2("�ڹ�", 25000));
		bookarray.add(new Book2("���̽�", 15000));
		bookarray.add(new Book2("�ȵ���̵�", 30000));
		Collections.sort(bookarray);
		
		System.out.println("========���å�� ������ ��============");
		int total = 0;
		for(Book2 b : bookarray) {
			total += b.getPrice();
		}
		System.out.println(total);
		
		System.out.println("=======å�� ������ 20,000�� �̻��� å�� �̸��� �����Ͽ� ���========");
		for(Book2 b : bookarray) {
			if(b.getPrice() >= 20000) {
				String str = b.getName();
				System.out.println(str);
				
				
				

			}
				
				
			}
			
			
		}
	}

