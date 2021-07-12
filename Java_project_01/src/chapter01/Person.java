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
		
		
		
		System.out.println("나이는 " + person.age);
		System.out.println("이름은 " + person.name);
		System.out.println("결혼여부는 " + person.married);
		System.out.println("아이수는 " + person.kidcount);
		
	}

}
