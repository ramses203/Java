package chapter03;

public class OperatorEx11 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		num1 += num2; // num1 = num1 + num2(num1은 num1+num2연산해서 맨왼쪽 num1에 할당하는것이다.)
		System.out.println(num1);

		num1 -= num2; // num1 = num1 - num2(여기서 num1은 이미 할당된 30이다.)
		System.out.println(num1);

		num1 *= num2; // num1 = num1 * num2(여기서 num1은 이미 할당된 10)
		System.out.println(num1);

		num1 /= num2; // num1 = num1 / num2(여기서 num1은 이미할당된 200)
		System.out.println(num1);

		num1 %= num2; // num1 = num1 % num2(여기서 num1은 이미할당된 10)
		System.out.println(num1);

	}
}
