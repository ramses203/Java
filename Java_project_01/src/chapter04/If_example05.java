package chapter04;

public class If_example05 {
	public static void main(String[] args) {

		int age = 7;
		int charge;
		
		
		//if ~ else if ~ �������� else�� �������� ���
		if (age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");

		}
		if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		if (age < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}

		else {
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�. ");
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");

	}
}
