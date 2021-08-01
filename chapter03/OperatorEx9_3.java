package chapter03;//결과값이 반대로 나온다.

public class OperatorEx9_3 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag;

		flag = !(num1 > 0);// 값은true지만 NOT이 붙어서 결과값은 false
		System.out.println(flag);

		flag = !(num2 < 0);// 값은false지만 NOT이 붙어서 결과값은 true
		System.out.println(flag);

		flag = !(num1 > num2);// 값은false지만 NOT이 붙어서 결과값은 true
		System.out.println(flag);

		flag = !(num1 < num2);// 값은true지만 NOT이 붙어서 결과값은 false
		System.out.println(flag);

	}

}
