package chapter03;

public class OperatorEx11 {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		num1 += num2; // num1 = num1 + num2(num1�� num1+num2�����ؼ� �ǿ��� num1�� �Ҵ��ϴ°��̴�.)
		System.out.println(num1);

		num1 -= num2; // num1 = num1 - num2(���⼭ num1�� �̹� �Ҵ�� 30�̴�.)
		System.out.println(num1);

		num1 *= num2; // num1 = num1 * num2(���⼭ num1�� �̹� �Ҵ�� 10)
		System.out.println(num1);

		num1 /= num2; // num1 = num1 / num2(���⼭ num1�� �̹��Ҵ�� 200)
		System.out.println(num1);

		num1 %= num2; // num1 = num1 % num2(���⼭ num1�� �̹��Ҵ�� 10)
		System.out.println(num1);

	}
}
