package chapter04;

import java.util.Scanner;

public class ����06 {

	public static void main(String[] args) {
		
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt();// �����б� 
		
		if (score >= 90) //���ھ 90�̻�
			grade = 'A';
		
		else if(score >= 80) //���ھ 80�̻� 90�̸�
			grade = 'B';
		
		else if(score >= 70) //���ھ 70�̻� 80�̸�
			grade = 'C';
		
		else if(score >= 60) //���ھ 60�̻� 70�̸�
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("����� ������" + grade + "�Դϴ�.");
		
		scanner.close();
		
			
		
		
	}

}
