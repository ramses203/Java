package chapter04;

public class Loop_do_while_Example01 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		do {
			sum += num; // sum = sum + num //do������ ������ �����Ų ������ 
			                               //while���� ���� T����F���� Ȯ���Ѵ�.
			                               //True�̸� do������ ���� ����� faulse��� ������ �� ���
			num ++; // ;�ڿ� 1�� �������Ѷ�

		}while (num <= 10);

		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);

	}

}
