package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayList = new ArrayList<>();
	
	
	public void push (String data) {
		arrayList.add(data);
	}
	
	
	public String pop() {
		int len = arrayList.size();
		if(len == 0) {
			System.out.println("요소가 비었습니다.");
			return null;
		}
		return arrayList.remove(len-1);
		
	}
	
	}
	







public class StackTest {
public static void main(String[] args) {
	
	MyStack stack = new MyStack();
	stack.push("A");
	stack.push("B");
	stack.push("C");
	
	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
}
}
