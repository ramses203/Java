package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		StringConCatImpl concat1 = new StringConCatImpl();
		concat1.makeString(s1, s2);
		
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);

		
		int i = 100;
		
		StringConcat concat3 = (s, v) -> {
			
			System.out.println(i);
			System.out.println(s+v);
		};
		
		System.out.println(concat3);
	}
}
