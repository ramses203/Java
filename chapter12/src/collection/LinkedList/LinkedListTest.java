package collection.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(0, "D");
		System.out.println(myList);
	
		myList.addFirst("AA");
		System.out.println(myList);
		
		myList.addLast("AAA");
		System.out.println(myList);
	
		
	}
}
