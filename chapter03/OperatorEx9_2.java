package chapter03;//���� �����߿� �ϳ��� ���̶� ������� ���̴�. 

public class OperatorEx9_2 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag = (num1 > 0) || (num2 > 0);// �� �� (���׸�����̶� true)
		System.out.println(flag);

		boolean flag2 = (num1 > 0) || (num2 < 0);// �� ���� (�ϳ��� ���̶� true)
		System.out.println(flag2);

		boolean flag3 = (num1 < 0) || (num2 > 0);// ���� �� (�ϳ��� ���̶� true)
		System.out.println(flag3);

		boolean flag4 = (num1 < 0) || (num2 < 0);// ���� ���� (���׸�� �����̶� false)
		System.out.println(flag4);

	}
}
