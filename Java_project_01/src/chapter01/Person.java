package chapter01;

public class Person {

	int age;
	String name;
	int kidcount;
	String married;
	
	
	
	public static void main(String[] args) {

		
		Person person = new Person();
		
		
		
		person.age = 40;
		person.name = "James";
		person.kidcount = 3;
		person.married = "ismarried";
		
		
		
		System.out.println("���̴� " + person.age);
		System.out.println("�̸��� " + person.name);
		System.out.println("��ȥ���δ� " + person.married);
		System.out.println("���̼��� " + person.kidcount);
		
	}

}
