package chapter03;

public class OperatorEx08 {
	public static void main(String[] args) {

		int myAge = 27;

		boolean value = (myAge > 23);// 크면T
		System.out.println(value);

		boolean value2 = (myAge < 23);// 작으면T
		System.out.println(value2);

		boolean value3 = (myAge >= 23);// 크거나 같으면T
		System.out.println(value3);

		boolean value4 = (myAge <= 23);// 작거나같으면T
		System.out.println(value4);

		boolean value5 = (myAge == 23); // 같으면T 다르면F
		System.out.println(value5);

		boolean value6 = (myAge != 23); // 같으면F 다르면T
		System.out.println(value6);

	}

}
