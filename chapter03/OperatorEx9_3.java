package chapter03;//������� �ݴ�� ���´�.

public class OperatorEx9_3 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag;

		flag = !(num1 > 0);// ����true���� NOT�� �پ ������� false
		System.out.println(flag);

		flag = !(num2 < 0);// ����false���� NOT�� �پ ������� true
		System.out.println(flag);

		flag = !(num1 > num2);// ����false���� NOT�� �پ ������� true
		System.out.println(flag);

		flag = !(num1 < num2);// ����true���� NOT�� �پ ������� false
		System.out.println(flag);

	}

}
