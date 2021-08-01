package chapter04;

public class Loop_for_continue_Ex {
	public static void main(String[] args) {
		int total = 0;  //for문 밖에서 선언한 total에 값을 할당한 경우
		int num;   // num은 그냥 선언만 
			//for (int total = 0, int num = 1; num <= 100; num++) <<for문 안에서 선언한 total 이렇게 할수도 있다. 
		for (num = 1; num <= 100; num++) {
			if(num % 2 == 0)//짝수일때는 continue를 적용해라 위에 있는 식을 연산하지말고 이값은 False
			continue;
			
			total += num; //total = total + num 값은 1
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total + " 입니다");
	}
}
