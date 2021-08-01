package chapter02;

public class CharacterEX01 {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1); // 문자출력
		System.out.println((int) ch1); // 문자에 해당하는 정수값(아스키코드)출력

		char ch2 = 66; // 정수값 대입
		System.out.println(ch2); // 정수값에 해당하는 문자출력

		int ch3 = 67;
		System.out.println(ch3); // 문자정수값 출력
		System.out.println((char) ch3); // 정수값에 해당하는 문자출력

	}

}
