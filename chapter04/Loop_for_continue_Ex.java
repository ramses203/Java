package chapter04;

public class Loop_for_continue_Ex {
	public static void main(String[] args) {
		int total = 0;  //for�� �ۿ��� ������ total�� ���� �Ҵ��� ���
		int num;   // num�� �׳� ���� 
			//for (int total = 0, int num = 1; num <= 100; num++) <<for�� �ȿ��� ������ total �̷��� �Ҽ��� �ִ�. 
		for (num = 1; num <= 100; num++) {
			if(num % 2 == 0)//¦���϶��� continue�� �����ض� ���� �ִ� ���� ������������ �̰��� False
			continue;
			
			total += num; //total = total + num ���� 1
		}
		System.out.println("1���� 100������ Ȧ���� ����: " + total + " �Դϴ�");
	}
}
