package chapter03;//두항이 모두 참이여야 참

public class OperatorEx09 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag = (num1 > 0) && (num2 > 0);// 참 참 (두항모두참이니까 true)
		System.out.println(flag);

		boolean flag2 = (num1 > 0) && (num2 < 0);// 참 거짓 (하나만 참이라서 false)
		System.out.println(flag2);

		boolean flag3 = (num1 < 0) && (num2 > 0);// 거짓 참 (하나만 참이라서 false)
		System.out.println(flag3);

		boolean flag4 = (num1 < 0) && (num2 < 0);// 거짓 거짓 (두항모두 거짓이라서 false)
		System.out.println(flag4);

	}

}
