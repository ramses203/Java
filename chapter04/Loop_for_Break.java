package chapter04;

public class Loop_for_Break {

	public static void main(String[] args) {
		int sum = 0;//sum ���� 0�� �Ҵ�
		int num = 0;//num���� 0�� �Ҵ�
		
		for(num = 0; ; num++) { // for����(�ʱⰪ; ���ǽ��� ����; ������)����
			sum += num; // sum = sum + num
			if (sum >= 100) // sum�� 100���� ũ�ų� ������ (����)
				break; // �ݺ��� �ߴ�.
			
		}

		System.out.println("num :" + num);// "num :"�� int num���� ����ض�
		System.out.println("sum :" + sum);// "sum :"�� int sum���� ����ض�
	}

}
