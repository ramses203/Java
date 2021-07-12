package chapter02;

public class Q4 {

	public static void main(String[] args) {

		byte i = 10;
		float j = 2.0f;

		System.out.println(i + j); // 암시적(묵시적 변환)

		System.out.println((int) (i + j)); // 명시적 변환
		System.out.println((int) (i - j)); // 명시적 변환
		System.out.println((int) (i * j)); // 명시적 변환
		System.out.println((int) (i / j)); // 명시적 변환

	}

}
