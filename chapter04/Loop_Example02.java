package chapter04;

public class Loop_Example02 {

	public static void main(String[] args) {
		int num = 1; //num�̶�� ������ 1�� �־��
		int sum = 0; //sum(sum�� ���� ����� ���� ����)�̶�� ������ 0�� �־��

		while (num <= 10) { // num������ 10���� ���ų� ����������

			sum += num; // sum = sum + num
			num++; // num�� ;�ڿ� 1�� ���� ���Ѷ�

		}

		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
