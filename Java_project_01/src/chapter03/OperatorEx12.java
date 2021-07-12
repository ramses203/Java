package chapter03;

public class OperatorEx12 {
	public static void main(String[] args) {

		int fatherAge = 45;
		int motherAge = 47;

		char ch;
		ch = (fatherAge < motherAge) ? 'T' : 'F'; // 조건이 참일때 앞에있는 T라는 문자가 프린드되고
													// 조건이 거짓일때 뒤에있는 F라는 문자가 프린드된다.

		System.out.println(ch);
	}

}
