package chapter04;

import java.util.Scanner;

public class Q01_2_IF {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int result = 0;

		System.out.println("�����ڸ� �Է��ϼ��� ��)+, -, *, /, %");
		Scanner scanner = new Scanner(System.in);//��ü����
		String S = scanner.next();//���ڿ��� �޾Ƽ� S������ �Ҵ�
		char operator = S.charAt(0);//ù��° ���ڸ� char���� oprator�� ���� 

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else if (operator == '%') {
			result = num1 % num2;
		} else {
			System.out.println("������ �����Դϴ�.");
			scanner.close();
			return;
		}
		System.out.println("�������" + result + "�Դϴ�.");
		scanner.close();
	}

}
