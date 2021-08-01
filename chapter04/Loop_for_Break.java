package chapter04;

public class Loop_for_Break {

	public static void main(String[] args) {
		int sum = 0;//sum 값에 0을 할당
		int num = 0;//num값에 0을 할당
		
		for(num = 0; ; num++) { // for문의(초기값; 조건식은 없고; 증가값)적용
			sum += num; // sum = sum + num
			if (sum >= 100) // sum이 100보다 크거나 같을떄 (종료)
				break; // 반복문 중단.
			
		}

		System.out.println("num :" + num);// "num :"과 int num값을 출력해라
		System.out.println("sum :" + sum);// "sum :"과 int sum값을 출력해라
	}

}
