package chapter03; //뒤앞

public class OperatorEx06 {

	public static void main(String[] args) {

		int gameScore = 150;

		int lastScore1 = gameScore++; // 변수앞에다 ++붙였을때는 ; 전에서 처리하고
		System.out.println(lastScore1); // 아직150
		System.out.println(gameScore); // 이제151

		int lastScore2 = --gameScore;
		System.out.println(lastScore2); // 연산된150
		System.out.println(gameScore); // 150그대로
	}
}
