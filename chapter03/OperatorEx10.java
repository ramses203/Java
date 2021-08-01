package chapter03;

public class OperatorEx10 {
	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 앞에 항이 false이므로 논리연산자 하나라도 거짓이므로 결과값은 false
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);// 앞에 항은 true 이므로 하나라도 참일 경우 결과값은 참
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	}

}
