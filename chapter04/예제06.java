package chapter04;

import java.util.Scanner;

public class 예제06 {

	public static void main(String[] args) {
		
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();// 점수읽기 
		
		if (score >= 90) //스코어가 90이상
			grade = 'A';
		
		else if(score >= 80) //스코어가 80이상 90미만
			grade = 'B';
		
		else if(score >= 70) //스코어가 70이상 80미만
			grade = 'C';
		
		else if(score >= 60) //스코어가 60이상 70미만
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("당신의 학점은" + grade + "입니다.");
		
		scanner.close();
		
			
		
		
	}

}
