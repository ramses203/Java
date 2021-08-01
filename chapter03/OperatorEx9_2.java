package chapter03;//합은 두항중에 하나만 참이라도 결과값은 참이다. 

public class OperatorEx9_2 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag = (num1 > 0) || (num2 > 0);// 참 참 (두항모두참이라서 true)
		System.out.println(flag);

		boolean flag2 = (num1 > 0) || (num2 < 0);// 참 거짓 (하나만 참이라서 true)
		System.out.println(flag2);

		boolean flag3 = (num1 < 0) || (num2 > 0);// 거짓 참 (하나만 참이라서 true)
		System.out.println(flag3);

		boolean flag4 = (num1 < 0) || (num2 < 0);// 거짓 거짓 (두항모두 거짓이라서 false)
		System.out.println(flag4);

	}
}
