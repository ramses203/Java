package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> queuelist = new ArrayList<>();
	
	
	public void enQueue(String data) {
		queuelist.add(data);
	}
	
	public String deQueue() {
		 int len = queuelist.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
			
		}
	return queuelist.remove(0);
}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue mQ = new MyQueue();
		mQ.enQueue("A");
		mQ.enQueue("B");
		mQ.enQueue("C");
		
		System.out.println(mQ.deQueue());
		System.out.println(mQ.deQueue());
		System.out.println(mQ.deQueue());
		System.out.println(mQ.deQueue());
	}
}
