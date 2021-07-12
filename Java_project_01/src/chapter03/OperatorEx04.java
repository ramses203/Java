package chapter03; //앞앞

public class OperatorEx04 {

	public static void main(String[] args) {

		int gameScore = 150;

		int lastScore1 = ++gameScore; // 변수앞에다 ++붙였을때는 ; 전에서 처리하고
		System.out.println(lastScore1); // 151출력
		System.out.println(gameScore); // 150그대로

		int lastScore2 = --gameScore;
		System.out.println(lastScore2); // 150출력
		System.out.println(gameScore); // 150그대로
	}
}
