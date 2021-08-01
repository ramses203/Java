package chapter04;

public class Loop_Example02 {

	public static void main(String[] args) {
		int num = 1; //num이라는 변수에 1을 넣어라
		int sum = 0; //sum(sum은 합한 결과를 담은 변수)이라는 변수에 0을 넣어라

		while (num <= 10) { // num변수를 10보다 같거나 작을때까지

			sum += num; // sum = sum + num
			num++; // num을 ;뒤에 1씩 증가 시켜라

		}

		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
