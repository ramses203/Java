package chapter04;       // if else if else���� case�� �ٲܼ��ִ�. 

public class If_example04 {
	public static void main(String[] args) {
		int age = 15;
		int charge;

		if (age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");

		} else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}

		else {                                 //�������� esle���� ������ ���� �ʴ´�. 
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�. ");
		}
		System.out.println("������ " + charge + "�� �Դϴ�.");
	}

}
