package chapter04;       // if else if else문은 case로 바꿀수있다. 

public class If_example04 {
	public static void main(String[] args) {
		int age = 15;
		int charge;

		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");

		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}

		else {                                 //마지막에 esle에는 조건이 오지 않는다. 
			charge = 3000;
			System.out.println("일반인 입니다. ");
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
	}

}
