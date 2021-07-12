package chapter04;

import java.util.Scanner;

public class Q01_3_IF {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int result = 0;

		System.out.println("연산자를 입력하세요 예)+, -, *, /, %");
		Scanner scanner = new Scanner(System.in);

		String S = scanner.next();
		char operator = S.charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 + num2;
			break;

		case '*':
			result = num1 + num2;
			break;

		case '/':
			result = num1 + num2;
			break;
		default:
			System.out.println("연산자 오류입니다.");
			scanner.close();
			return;
		}
		System.out.println("결과값은" + result + "입니다.");
		scanner.close();
	}

}
