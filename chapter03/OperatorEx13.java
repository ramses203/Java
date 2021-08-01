package chapter03;

public class OperatorEx13 {
	public static void main(String[] args) {

		int num1 = 5; // 0000 0000, 0000 0000, 0000 0000, 0000 0101

		int num2 = 10; // 0000 0000, 0000 0000, 0000 0001, 1111 1110

		int result = num1 & num2; /// float나 double이오면 오류난다. 정수형데이터인int가 와야한다.
		int result2 = num1 | num2;
		int result3 = num1 ^ num2;
		int result4 = ~num1;

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
