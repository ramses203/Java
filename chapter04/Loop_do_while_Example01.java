package chapter04;

public class Loop_do_while_Example01 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		do {
			sum += num; // sum = sum + num //do조건을 무조건 실행시킨 다음에 
			                               //while문에 가서 T인지F인지 확인한다.
			                               //True이면 do문으로 가서 재실행 faulse라면 마지막 값 출력
			num ++; // ;뒤에 1씩 증가시켜라

		}while (num <= 10);

		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);

	}

}
